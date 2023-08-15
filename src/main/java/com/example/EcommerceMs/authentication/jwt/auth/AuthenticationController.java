package com.example.EcommerceMs.authentication.jwt.auth;

import com.example.EcommerceMs.authentication.jwt.service.AuthenticationService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping(path = "/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;


    @PostMapping(path = "/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody @Valid UserRequest request) throws MessagingException, UnsupportedEncodingException {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @GetMapping(path = "/verify")
    public ResponseEntity<?> verifyAccount(@RequestParam(value = "code", required = true) String code, @RequestParam(value = "username") String userName)  {

        authenticationService.verifyAccount(userName);

        return ResponseEntity.ok("Account verified successfully");
    }


    @PostMapping(path = "/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid AuthenticationRequest authenticationRequest) {
        System.out.println(authenticationRequest);
        return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
    }
}
