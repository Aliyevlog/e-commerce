package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.OrderDetailsDto;
import com.example.EcommerceMs.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "orderDetails")
@RequiredArgsConstructor

public class OrderDetailsController {

    private final OrderDetailsService orderDetailsService;

    @GetMapping
    public List<OrderDetailsDto> getOrderDetails() {
        return orderDetailsService.getOrderDetails();
    }

    @PostMapping

    public OrderDetailsDto postOrderDetails(@RequestBody OrderDetailsDto orderDetailsDto) {
        return orderDetailsService.postOrderDetails(orderDetailsDto);
    }

    @PutMapping

    public OrderDetailsDto putOrderDetails(@RequestBody OrderDetailsDto orderDetailsDto) {
        return orderDetailsService.putOrderDetails(orderDetailsDto);

    }

    @DeleteMapping(path = "/{id}")
    public void deleteOrderDetails(@PathVariable(name = "id") Integer id) {
        orderDetailsService.deleteOrderDetails(id);

    }

}
