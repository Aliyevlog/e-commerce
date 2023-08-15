package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.OrderDetailsDto;
import com.example.EcommerceMs.entity.OrderDetails;
import com.example.EcommerceMs.mapper.OrderDetailsMapper;
import com.example.EcommerceMs.repository.OrderDetailsRepository;
import com.example.EcommerceMs.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderDetailsServiceImp implements OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;

    private final OrderDetailsMapper orderDetailsMapper;

    @Override
    public List<OrderDetailsDto> getOrderDetails() {

        var orderDetailsList = orderDetailsRepository.findAll();
        return orderDetailsMapper.toDtos(orderDetailsList);

    }

    @Override
    public OrderDetailsDto postOrderDetails(OrderDetailsDto orderDetailsDto) {
        OrderDetails orderDetailsEntity = orderDetailsMapper.fromDto(orderDetailsDto);
        orderDetailsEntity = orderDetailsRepository.save(orderDetailsEntity);
        return orderDetailsMapper.toDto(orderDetailsEntity);

    }

    @Override
    public OrderDetailsDto putOrderDetails(OrderDetailsDto orderDetailsDto) {

        OrderDetails orderDetailsEntity = orderDetailsMapper.fromDto(orderDetailsDto);
        orderDetailsEntity = orderDetailsRepository.save(orderDetailsEntity);
        return orderDetailsMapper.toDto(orderDetailsEntity);

    }

    @Override
    public void deleteOrderDetails(Integer id) {

        var orderDetails = orderDetailsRepository.findById(id);
        if (orderDetails.isPresent()) ;
        orderDetailsRepository.delete(orderDetails.get());

    }
}
