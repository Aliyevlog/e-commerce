package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.PaymentDetailsDto;
import com.example.EcommerceMs.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "paymentDetails")
@RequiredArgsConstructor
public class PaymentDetailsController {

    private final PaymentDetailsService paymentDetailsService;


    @GetMapping
    public List<PaymentDetailsDto> getPaymentDetails() {
        return paymentDetailsService.getPaymentDetails();
    }


    @PostMapping
    public PaymentDetailsDto createPaymentDetails(@RequestBody PaymentDetailsDto paymentDetailsDto) {

        return paymentDetailsService.createPaymentDetails(paymentDetailsDto);
    }


    @PutMapping

    public PaymentDetailsDto updatePaymentDetails(@RequestBody PaymentDetailsDto paymentDetailsDto) {
        return paymentDetailsService.updatePaymentDetails(paymentDetailsDto);
    }


    @DeleteMapping("/{id}")

    public void deletePaymentDetails(@PathVariable(name = "id") Integer id) {
        paymentDetailsService.deletePaymentDetails(id);
    }

}
