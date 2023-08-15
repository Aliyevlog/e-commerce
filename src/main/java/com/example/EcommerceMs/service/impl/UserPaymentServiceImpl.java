package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.UserPaymentDto;
import com.example.EcommerceMs.entity.UserPayment;
import com.example.EcommerceMs.mapper.UserPaymentMapper;
import com.example.EcommerceMs.repository.UserPaymentRepository;
import com.example.EcommerceMs.service.UserPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserPaymentServiceImpl implements UserPaymentService {

    private final UserPaymentRepository userPaymentRepository;
    private final UserPaymentMapper userPaymentMapper;

    @Override

    public List<UserPaymentDto> getUserPayment() {
        var userPaymentList = userPaymentRepository.findAll();
        return userPaymentMapper.toDtos(userPaymentList);
    }

    @Override

    public UserPaymentDto createUserPayment(UserPaymentDto userPaymentDto) {
        UserPayment userPaymentEntity = userPaymentMapper.fromDto(userPaymentDto);
        userPaymentEntity = userPaymentRepository.save(userPaymentEntity);
        return userPaymentMapper.toDto(userPaymentEntity);
    }

    @Override

    public UserPaymentDto updateUserPayment(UserPaymentDto userPaymentDto) {
        UserPayment userPaymentEntity = userPaymentMapper.fromDto(userPaymentDto);
        userPaymentEntity = userPaymentRepository.save(userPaymentEntity);
        return userPaymentMapper.toDto(userPaymentEntity);
    }

    @Override

    public void deleteUserPayment(Integer id) {
        var deleteUserPayment = userPaymentRepository.findById(id);
        deleteUserPayment.ifPresent(userPaymentRepository::delete);

    }
}
