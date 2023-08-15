package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.UserPaymentDto;

import java.util.List;

public interface UserPaymentService {
    List<UserPaymentDto> getUserPayment();

    UserPaymentDto createUserPayment(UserPaymentDto userPaymentDto);

    UserPaymentDto updateUserPayment(UserPaymentDto userPaymentDto);

    void deleteUserPayment(Integer id);
}
