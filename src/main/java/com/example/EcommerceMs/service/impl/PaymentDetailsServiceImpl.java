package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.PaymentDetailsDto;
import com.example.EcommerceMs.entity.PaymentDetails;
import com.example.EcommerceMs.mapper.PaymentDetailsMapper;
import com.example.EcommerceMs.repository.PaymentDetailsRepository;
import com.example.EcommerceMs.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PaymentDetailsServiceImpl implements PaymentDetailsService {
    private final PaymentDetailsRepository paymentDetailsRepository;
    private final PaymentDetailsMapper paymentDetailsMapper;

    @Override

    public List<PaymentDetailsDto> getPaymentDetails() {
        var paymentDetailsList = paymentDetailsRepository.findAll();
        return paymentDetailsMapper.toDtos(paymentDetailsList);
    }

    @Override

    public PaymentDetailsDto createPaymentDetails(PaymentDetailsDto paymentDetailsDto) {
        PaymentDetails paymentDetailEntity = paymentDetailsMapper.fromDto(paymentDetailsDto);
        paymentDetailEntity = paymentDetailsRepository.save(paymentDetailEntity);
        return paymentDetailsMapper.toDto(paymentDetailEntity);
    }

    @Override

    public PaymentDetailsDto updatePaymentDetails(PaymentDetailsDto paymentDetailsDto) {
        PaymentDetails paymentDetailEntity = paymentDetailsMapper.fromDto(paymentDetailsDto);
        paymentDetailEntity = paymentDetailsRepository.save(paymentDetailEntity);
        return paymentDetailsMapper.toDto(paymentDetailEntity);
    }

    @Override

    public void deletePaymentDetails(Integer id) {
        var paymentDetails = paymentDetailsRepository.findById(id);
        paymentDetails.ifPresent(paymentDetailsRepository::delete);

    }
}
