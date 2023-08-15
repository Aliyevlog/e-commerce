package com.example.EcommerceMs.authentication.jwt.service;

import com.example.EcommerceMs.authentication.jwt.auth.AuthenticationRequest;
import com.example.EcommerceMs.authentication.jwt.auth.AuthenticationResponse;
import com.example.EcommerceMs.authentication.jwt.auth.UserRequest;
import com.example.EcommerceMs.authentication.jwt.exception.DisabledAccountException;
import com.example.EcommerceMs.authentication.jwt.exception.UserAlreadyExistException;
import com.example.EcommerceMs.authentication.jwt.user.UserDto;
import com.example.EcommerceMs.entity.User;
import com.example.EcommerceMs.repository.UserRepository;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationService {


    private static String HOST_EMAIL = "example@gmail.com";



    private static String HOST_URL = "localhost:8087/auth";
    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;

    private final JWTService jwtService;

    private final AuthenticationManager authenticationManager;

    private final JavaMailSender mailSender;

    public AuthenticationResponse register(UserRequest request) throws MessagingException, UnsupportedEncodingException {

        Optional<User> byUsername = repository.findByUsername(request.getUserName());
        Optional<User> byGmail = repository.findByEmail(request.getEmail());

        if(byUsername.isPresent() || byGmail.isPresent()) {
            throw new UserAlreadyExistException("User Already Exist!");
        }

        User user = User.builder()
                .username(request.getUserName())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .password(passwordEncoder.encode(request.getPassword()))
                .telephone(request.getPhone())
                .email(request.getEmail())
                .build();

        user.setEnabled(false);
        User savedUser = repository.save(user);

        sendVerificationEmail(savedUser, HOST_URL);

        UserDto userDto = UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .userName(user.getUsername())
                .phoneNumber(user.getTelephone())
                .password(user.getPassword())
                .build();

        String token = jwtService.generateToken(userDto);

        return AuthenticationResponse.builder()
                .token(token).build();
    }

    public void sendVerificationEmail(User user, String url) throws MessagingException, UnsupportedEncodingException {
        String toAddress = user.getEmail();
        String fromAddress = HOST_EMAIL;
        String senderName = "Your company name";
        String subject = "Please verify your registration";
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your registration:<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "Your company name.";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);

        content = content.replace("[[name]]", user.getFirstName() + " " + user.getLastName());
        String verifyURL = url + "/verify?code=" + getVerificationCode() + "&username=" + user.getUsername();

        content = content.replace("[[URL]]", verifyURL);

        helper.setText(content, true);

        log.info(verifyURL);

//        mailSender.send(message);
    }


    public void verifyAccount(String userName) {
        User user = repository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("Not Found"));
        user.setEnabled(true);
        repository.save(user);
    }

    private String getVerificationCode() {
        String random = RandomStringUtils.randomAlphanumeric(20);
        return random;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),
                        request.getPassword()
                )
        );

        User user = repository.findByUsername(request.getUserName())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        if(!user.isEnabled()){
            throw new DisabledAccountException("Your account disabled");
        }

        UserDto userDto = UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .userName(user.getUsername())
                .phoneNumber(user.getTelephone())
                .password(user.getPassword())
                .build();
        String token = jwtService.generateToken(userDto);

        return AuthenticationResponse.builder()
                .token(token)
                .build();

    }

}
