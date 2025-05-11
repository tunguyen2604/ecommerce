package com.example.ecommerce.repository;

import com.example.ecommerce.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findBycustomername(String customername);
}
