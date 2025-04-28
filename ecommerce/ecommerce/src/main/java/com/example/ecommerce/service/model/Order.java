package com.example.ecommerce.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderID;
    Customer customer;
    LocalDate orderDate;
    int totalAmount;
    short status;
    List<OrderItem> list_OrderItems = new ArrayList<>();
    public Order(int orderID, Customer customer,  int totalAmount, short  status) {
        this.orderID = orderID;
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void addOrderItem(OrderItem orderItem1) {
        // TODO Auto-generated method stub
        list_OrderItems.add(orderItem1);
    }
    


}
