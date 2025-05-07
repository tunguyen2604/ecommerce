package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.OrderItem;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderItem, Long>{
    List<OrderItem> findBycustomer_id(String customer_id);
}
