package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.UserPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentRepository extends JpaRepository<UserPayment,Integer> {
}
