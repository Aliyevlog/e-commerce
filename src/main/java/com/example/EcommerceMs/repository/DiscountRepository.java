package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount,Integer> {
}
