package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getUser();

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    void deleteUser(Integer id);
}
