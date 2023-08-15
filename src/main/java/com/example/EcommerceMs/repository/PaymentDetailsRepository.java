package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Integer> {
}
