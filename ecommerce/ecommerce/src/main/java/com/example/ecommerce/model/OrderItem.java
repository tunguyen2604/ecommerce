package com.example.ecommerce.model;

public class OrderItem {
    int OrderID;
    int OrderItemID;
    Products products;
    int soldQuantity;
    int unitPrice;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getOrderItemID() {
        return OrderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        OrderItemID = orderItemID;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderItem(Products products, int unitPrice) {
        this.products = products;
        this.unitPrice = unitPrice;
    }

}
