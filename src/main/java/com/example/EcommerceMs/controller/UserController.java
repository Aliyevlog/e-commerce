package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.UserDto;
import com.example.EcommerceMs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping

    public List<UserDto> getUser() {
        return userService.getUser();
    }

    @PutMapping

    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PostMapping

    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/{id}")

    public void deleteUser(@PathVariable(name = "id") Integer id) {
        userService.deleteUser(id);

    }

}
