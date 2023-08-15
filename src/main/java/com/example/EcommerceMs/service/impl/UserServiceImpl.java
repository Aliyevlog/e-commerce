package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.UserDto;
import com.example.EcommerceMs.entity.User;
import com.example.EcommerceMs.entity.UserAddress;
import com.example.EcommerceMs.mapper.UserMapper;
import com.example.EcommerceMs.mapper.UserPaymentMapper;
import com.example.EcommerceMs.repository.UserRepository;
import com.example.EcommerceMs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override

    public List<UserDto> getUser() {
        var userList = userRepository.findAll();
        return userMapper.toDtos(userList);
    }

    @Override

    public UserDto createUser(UserDto userDto) {
        User userEntity = userMapper.fromDto(userDto);
        userEntity = userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }

    @Override

    public UserDto updateUser(UserDto userDto) {
        User userEntity = userMapper.fromDto(userDto);
        userEntity = userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }

    @Override

    public void deleteUser(Integer id) {
        var deleteUser = userRepository.findById(id);
        deleteUser.ifPresent(userRepository::delete);

    }
}
