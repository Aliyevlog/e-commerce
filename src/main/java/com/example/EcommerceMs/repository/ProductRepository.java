package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
