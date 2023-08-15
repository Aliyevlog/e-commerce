package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.UserAddressDto;

import java.util.List;

public interface UserAddressService {
    List<UserAddressDto> getUserAddress();

    UserAddressDto createUserAddress(UserAddressDto userAddressDto);

    UserAddressDto updateUserAddress(UserAddressDto userAddressDto);

    void deleteUserAddress(Integer id);
}
