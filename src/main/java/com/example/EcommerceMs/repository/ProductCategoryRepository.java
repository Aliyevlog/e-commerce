package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
