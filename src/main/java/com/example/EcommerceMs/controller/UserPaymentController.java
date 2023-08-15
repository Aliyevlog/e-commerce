package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.UserPaymentDto;
import com.example.EcommerceMs.service.UserPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "userPayment")
@RequiredArgsConstructor
public class UserPaymentController {

    private final UserPaymentService userPaymentService;

    @GetMapping

    public List<UserPaymentDto> getUserPayment() {
        return userPaymentService.getUserPayment();
    }

    @PutMapping

    public UserPaymentDto createUserPayment(@RequestBody UserPaymentDto userPaymentDto) {
        return userPaymentService.createUserPayment(userPaymentDto);
    }

    @PostMapping

    public UserPaymentDto updateUserPayment(@RequestBody UserPaymentDto userPaymentDto) {
        return userPaymentService.updateUserPayment(userPaymentDto);
    }

    @DeleteMapping("/{id}")

    public void deleteUserPayment(@PathVariable(name = "id") Integer id) {
        userPaymentService.deleteUserPayment(id);

    }
}
