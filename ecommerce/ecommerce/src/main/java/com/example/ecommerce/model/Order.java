package com.example.ecommerce.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderID;
    Customer customer;
    LocalDate orderDate;
    int totalAmount;
    short status;
    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public List<OrderItem> getList_OrderItems() {
        return list_OrderItems;
    }

    public void setList_OrderItems(List<OrderItem> list_OrderItems) {
        this.list_OrderItems = list_OrderItems;
    }

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
