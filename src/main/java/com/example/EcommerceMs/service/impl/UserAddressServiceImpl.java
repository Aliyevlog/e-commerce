package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.UserAddressDto;
import com.example.EcommerceMs.entity.UserAddress;
import com.example.EcommerceMs.mapper.UserAddressMapper;
import com.example.EcommerceMs.repository.UserAddressRepository;
import com.example.EcommerceMs.service.UserAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserAddressServiceImpl implements UserAddressService {

    private final UserAddressRepository userAddressRepository;
    private final UserAddressMapper userAddressMapper;

    @Override

    public List<UserAddressDto> getUserAddress() {
        var userAddressList = userAddressRepository.findAll();
        return userAddressMapper.toDtos(userAddressList);
    }

    @Override

    public UserAddressDto createUserAddress(UserAddressDto userAddressDto) {
        UserAddress userAddressEntity = userAddressMapper.fromDto(userAddressDto);
        userAddressEntity = userAddressRepository.save(userAddressEntity);
        return userAddressMapper.toDto(userAddressEntity);
    }

    @Override

    public UserAddressDto updateUserAddress(UserAddressDto userAddressDto) {
        UserAddress userAddressEntity = userAddressMapper.fromDto(userAddressDto);
        userAddressEntity = userAddressRepository.save(userAddressEntity);
        return userAddressMapper.toDto(userAddressEntity);
    }

    @Override

    public void deleteUserAddress(Integer id) {
        var deleteUserAddress = userAddressRepository.findById(id);
        deleteUserAddress.ifPresent(userAddressRepository::delete);

    }
}
