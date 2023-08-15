package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.OrderItemsDto;

import java.util.List;

public interface OrderItemsService {

    List<OrderItemsDto> getOrderItems();

    OrderItemsDto createOrderItems(OrderItemsDto orderItemsDto);

    OrderItemsDto updateOrderItems(OrderItemsDto orderItemsDto);

    void deleteOrderItems(Integer id);
}
