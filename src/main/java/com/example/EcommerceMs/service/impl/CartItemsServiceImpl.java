package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.CartItemsDto;
import com.example.EcommerceMs.entity.CartItems;
import com.example.EcommerceMs.mapper.CartItemsMapper;
import com.example.EcommerceMs.repository.CartItemsRepository;
import com.example.EcommerceMs.service.CartItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemsServiceImpl implements CartItemsService {

    private final CartItemsRepository cartItemsRepository;
    private final CartItemsMapper cartItemsMapper;


    @Override
    public List<CartItemsDto> getCartItems() {
        var cartItemsList = cartItemsRepository.findAll();
        return cartItemsMapper.toDtos(cartItemsList);

    }

    @Override
    public CartItemsDto postCartItems(CartItemsDto cartItemsDto) {
        CartItems cartItemsEntity = cartItemsMapper.fromDto(cartItemsDto);
        cartItemsEntity = cartItemsRepository.save(cartItemsEntity);
        return cartItemsMapper.toDto(cartItemsEntity);

    }

    @Override
    public CartItemsDto putCartItems(CartItemsDto cartItemsDto) {
        CartItems cartItemsEntity = cartItemsMapper.fromDto(cartItemsDto);
        cartItemsEntity = cartItemsRepository.save(cartItemsEntity);
        return cartItemsMapper.toDto(cartItemsEntity);

    }

    @Override
    public void deleteCartItems(Integer id) {
        var cartItems = cartItemsRepository.findById(id);
        if (cartItems.isPresent()) ;
        cartItemsRepository.delete(cartItems.get());

    }
}
