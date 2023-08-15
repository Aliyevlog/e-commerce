package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.DiscountDto;
import com.example.EcommerceMs.entity.Discount;
import com.example.EcommerceMs.mapper.DiscountMapper;
import com.example.EcommerceMs.repository.DiscountRepository;
import com.example.EcommerceMs.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepository discountRepository;
    private final DiscountMapper discountMapper;

    @Override
    public List<DiscountDto> getDiscount() {

        var discountList = discountRepository.findAll();
        return discountMapper.toDtos(discountList);
    }

    @Override
    public DiscountDto postDiscount(DiscountDto discountDto) {

        Discount discountEntity = discountMapper.fromDto(discountDto);
        discountEntity = discountRepository.save(discountEntity);
        return discountMapper.toDto(discountEntity);
    }

    @Override
    public DiscountDto putDiscount(DiscountDto discountDto) {

        Discount discountEntity = discountMapper.fromDto(discountDto);
        discountEntity = discountRepository.save(discountEntity);
        return discountMapper.toDto(discountEntity);

    }

    @Override
    public void deleteDiscount(Integer id) {

        var discountType = discountRepository.findById(id);
        if (discountType.isPresent()) ;
        discountRepository.delete(discountType.get());
    }
}
