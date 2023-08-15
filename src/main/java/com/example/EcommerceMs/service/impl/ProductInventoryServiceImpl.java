package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.DiscountDto;
import com.example.EcommerceMs.dto.ProductInventoryDto;
import com.example.EcommerceMs.entity.Discount;
import com.example.EcommerceMs.entity.ProductInventory;
import com.example.EcommerceMs.mapper.ProductInventoryMapper;
import com.example.EcommerceMs.repository.ProductInventoryRepository;
import com.example.EcommerceMs.service.ProductInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductInventoryServiceImpl implements ProductInventoryService {

    private final ProductInventoryRepository productInventoryRepository;
    private final ProductInventoryMapper productInventoryMapper;


    @Override
    public List<ProductInventoryDto> getProductInventory() {

        var productInventoryList = productInventoryRepository.findAll();
        return productInventoryMapper.toDtos(productInventoryList);
    }

    @Override
    public ProductInventoryDto createProductInventory (ProductInventoryDto productInventoryDto) {

        ProductInventory productInventoryEntity = productInventoryMapper.fromDto(productInventoryDto);
        productInventoryEntity = productInventoryRepository.save(productInventoryEntity);
        return productInventoryMapper.toDto(productInventoryEntity);
    }

    @Override

    public ProductInventoryDto updateProductInventory (ProductInventoryDto productInventoryDto) {

        ProductInventory productInventoryEntity = productInventoryMapper.fromDto(productInventoryDto);
        productInventoryEntity = productInventoryRepository.save(productInventoryEntity);
        return productInventoryMapper.toDto(productInventoryEntity);

    }

    @Override
    public void deleteProductInventory(Integer id) {

        var productInventory = productInventoryRepository.findById(id);
        if (productInventory.isPresent()) ;
        productInventoryRepository.delete(productInventory.get());
    }
}
