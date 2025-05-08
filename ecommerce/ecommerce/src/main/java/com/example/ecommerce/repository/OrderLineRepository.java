package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Orderlines;

@Repository
public interface OrderLineRepository extends JpaRepository<Orderlines, Long>{

    @Query("SELECT new com.example.ecommere.OrderlineView(p.title, o.orderDate, ol.quantity, ol.price, ol.status, ol.rate) " +
    "FROM Orderline ol " +
    "JOIN ol.product p " +
    "JOIN ol.order o ")
    List<Orderlines> fetchJoinedOrderItems();
}
