package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.OrderItemsDto;
import com.example.EcommerceMs.entity.OrderItems;
import com.example.EcommerceMs.mapper.OrderItemsMapper;
import com.example.EcommerceMs.repository.OrderItemsRepository;
import com.example.EcommerceMs.service.OrderItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderItemsServiceImpl implements OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    private final OrderItemsMapper orderItemsMapper;

    @Override
    public List<OrderItemsDto> getOrderItems() {
        var orderItemsList = orderItemsRepository.findAll();
        return orderItemsMapper.toDtos(orderItemsList);
    }

    @Override
    public OrderItemsDto createOrderItems(OrderItemsDto orderItemsDto) {
        OrderItems orderItemsEntity = orderItemsMapper.fromDto(orderItemsDto);
        orderItemsEntity = orderItemsRepository.save(orderItemsEntity);
        return orderItemsMapper.toDto(orderItemsEntity);
    }

    @Override
    public OrderItemsDto updateOrderItems(OrderItemsDto orderItemsDto) {
        OrderItems orderItemsEntity = orderItemsMapper.fromDto(orderItemsDto);
        orderItemsEntity = orderItemsRepository.save(orderItemsEntity);
        return orderItemsMapper.toDto(orderItemsEntity);
    }

    @Override
    public void deleteOrderItems(Integer id) {
        var orderItems = orderItemsRepository.findById(id);
        if (orderItems.isPresent()) ;
        orderItemsRepository.delete(orderItems.get());

    }
}
