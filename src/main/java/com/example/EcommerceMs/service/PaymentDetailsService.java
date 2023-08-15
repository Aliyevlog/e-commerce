package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.PaymentDetailsDto;

import java.util.List;

public interface PaymentDetailsService {
    List<PaymentDetailsDto> getPaymentDetails();

    PaymentDetailsDto createPaymentDetails(PaymentDetailsDto paymentDetailsDto);

    PaymentDetailsDto updatePaymentDetails(PaymentDetailsDto paymentDetailsDto);

    void deletePaymentDetails(Integer id);
}