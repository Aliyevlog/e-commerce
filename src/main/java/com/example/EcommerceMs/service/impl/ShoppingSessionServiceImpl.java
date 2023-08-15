package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.ShoppingSessionDto;
import com.example.EcommerceMs.entity.ShoppingSession;
import com.example.EcommerceMs.mapper.ShoppingSessionMapper;
import com.example.EcommerceMs.repository.ShoppingSessionRepository;
import com.example.EcommerceMs.service.ShoppingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ShoppingSessionServiceImpl implements ShoppingSessionService {

    private final ShoppingSessionRepository shoppingSessionRepository;
    private final ShoppingSessionMapper shoppingSessionMapper;

    @Override

    public List<ShoppingSessionDto> getShoppingSession() {
        var shoppingSessionList = shoppingSessionRepository.findAll();
        return shoppingSessionMapper.toDtos(shoppingSessionList);
    }

    @Override

    public ShoppingSessionDto createShoppingSession(ShoppingSessionDto shoppingSessionDto) {
        ShoppingSession shoppingSessionEntity = shoppingSessionMapper.fromDto(shoppingSessionDto);
        shoppingSessionEntity = shoppingSessionRepository.save(shoppingSessionEntity);
        return shoppingSessionMapper.toDto(shoppingSessionEntity);
    }

    @Override

    public ShoppingSessionDto updateShoppingSession(ShoppingSessionDto shoppingSessionDto) {
        ShoppingSession shoppingSessionEntity = shoppingSessionMapper.fromDto(shoppingSessionDto);
        shoppingSessionEntity = shoppingSessionRepository.save(shoppingSessionEntity);
        return shoppingSessionMapper.toDto(shoppingSessionEntity);
    }

    @Override

    public void deleteShoppingSession(Integer id) {
        var deleteShoppingSession = shoppingSessionRepository.findById(id);
        deleteShoppingSession.ifPresent(shoppingSessionRepository::delete);

    }
}
