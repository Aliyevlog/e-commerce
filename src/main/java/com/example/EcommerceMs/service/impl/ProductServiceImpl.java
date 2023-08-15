package com.example.EcommerceMs.service.impl;

import com.example.EcommerceMs.dto.ProductDto;
import com.example.EcommerceMs.entity.Product;
import com.example.EcommerceMs.mapper.ProductMapper;
import com.example.EcommerceMs.repository.ProductRepository;
import com.example.EcommerceMs.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override

    public List<ProductDto> getProduct() {
        var productList = productRepository.findAll();
        return productMapper.toDtos(productList);
    }

    @Override

    public ProductDto createProduct(ProductDto productDto) {
        Product productEntity = productMapper.fromDto(productDto);
        productEntity = productRepository.save(productEntity);
        return productMapper.toDto(productEntity);
    }

    @Override

    public ProductDto updateProduct(ProductDto productDto) {
        Product productEntity = productMapper.fromDto(productDto);
        productEntity = productRepository.save(productEntity);
        return productMapper.toDto(productEntity);
    }

    @Override

    public void deleteProduct(Integer id) {
        var product = productRepository.findById(id);
        product.ifPresent(productRepository::delete);
    }
}
