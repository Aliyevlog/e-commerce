package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.UserAddressDto;
import com.example.EcommerceMs.service.UserAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "userAddress")
@RequiredArgsConstructor
public class UserAddressController {

    private final UserAddressService userAddressService;

    @GetMapping

    public List<UserAddressDto> getUserAddress() {
        return userAddressService.getUserAddress();
    }

    @PutMapping

    public UserAddressDto createUserAddress(@RequestBody UserAddressDto userAddressDto) {
        return userAddressService.createUserAddress(userAddressDto);
    }

    @PostMapping

    public UserAddressDto updateeUserAddress(@RequestBody UserAddressDto userAddressDto) {
        return userAddressService.updateUserAddress(userAddressDto);
    }

    @DeleteMapping("/{id}")

    public void deleteUserAddress(@PathVariable(name = "id") Integer id) {
        userAddressService.deleteUserAddress(id);

    }
}
