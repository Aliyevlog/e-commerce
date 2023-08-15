package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.OrderDetailsDto;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetailsDto> getOrderDetails();

    OrderDetailsDto postOrderDetails(OrderDetailsDto orderDetailsDto);

    OrderDetailsDto putOrderDetails(OrderDetailsDto orderDetailsDto);

    void deleteOrderDetails(Integer id);
}
