package com.example.ecommerce.service;

public class OrderItem {
    int OrderID;
    int OrderItemID;
    Products products;
    int soldQuantity;
    int unitPrice;

    public OrderItem(Products products, int unitPrice) {
        this.products = products;
        this.unitPrice = unitPrice;
    }

}
