package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.ProductCategoryDto;
import com.example.EcommerceMs.entity.ProductCategory;
import com.example.EcommerceMs.mapper.ProductCategoryMapper;
import com.example.EcommerceMs.repository.ProductCategoryRepository;
import com.example.EcommerceMs.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;
    private final ProductCategoryMapper productCategoryMapper;


    @Override

    public List<ProductCategoryDto> getProductCategory() {
        var productCategoryList = productCategoryRepository.findAll();
        return productCategoryMapper.toDtos(productCategoryList);
    }

    @Override

    public ProductCategoryDto createProductCategory(ProductCategoryDto productCategoryDto) {
        ProductCategory productCategoryEntity = productCategoryMapper.fromDto(productCategoryDto);
        productCategoryEntity = productCategoryRepository.save(productCategoryEntity);
        return productCategoryMapper.toDto(productCategoryEntity);
    }

    @Override

    public ProductCategoryDto updateProductCategory(ProductCategoryDto productCategoryDto) {
        ProductCategory productCategoryEntity = productCategoryMapper.fromDto(productCategoryDto);
        productCategoryEntity = productCategoryRepository.save(productCategoryEntity);
        return productCategoryMapper.toDto(productCategoryEntity);
    }

    @Override

    public void deleteProductCategory(Integer id) {
        var productCategory = productCategoryRepository.findById(id);
        if (productCategory.isPresent()) {
            productCategoryRepository.delete(productCategory.get());
        }
    }
}
