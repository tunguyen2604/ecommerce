package com.example.ecommerce.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Orderlines;

@Repository
// public interface OrderLineRepository extends JpaRepository<Orderlines, Long>{

//     @Query("SELECT new com.example.ecommere.OrderlineView(p.name, o.orderdate, ol.quantity, p.sellprice) " +
//     "FROM orderlines ol " +
//     "JOIN product p ON ol.id = p.id " +
//     "JOIN orders o ON o.orderid = ol.orderlineid ")
//     List<Orderlines> fetchJoinedOrderItems();
//     @Repository
public interface OrderlineRepository extends JpaRepository<Orderlines, Integer> {

    @Query(value = """
        SELECT p.name, o.orderdate, ol.quantity, p.sellprice
        FROM orderlines ol
        JOIN product p ON ol.id = p.id
        JOIN orders o ON ol.orderid = o.orderid
        WHERE o.customerid = :customerid
        """, nativeQuery = true)
    List<Object[]> fetchJoinedOrderItems(@Param("customerid") int customerid);
}


