package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.OrderItemsDto;
import com.example.EcommerceMs.service.OrderItemsService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "orderItems")
@RequiredArgsConstructor
public class OrderItemsController {

    private final OrderItemsService orderItemsService;

    @GetMapping
    public List<OrderItemsDto> getOrderItems() {
        return orderItemsService.getOrderItems();
    }

    @PostMapping
    public OrderItemsDto createOrderItems(@RequestBody OrderItemsDto orderItemsDto) {
        return orderItemsService.createOrderItems(orderItemsDto);
    }

    @PutMapping
    public OrderItemsDto updateOrderItems(@RequestBody OrderItemsDto orderItemsDto) {
        return orderItemsService.updateOrderItems(orderItemsDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteOrderItems(@PathVariable(name = "id") Integer id) {
        orderItemsService.deleteOrderItems(id);
    }

}
