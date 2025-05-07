package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    int OrderItemID;

    @OneToOne
    @JoinColumn(name = "OrderItemID")
    Product products;
    int soldQuantity;
    int unitPrice;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    public int getOrderItemID() {
        return OrderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        OrderItemID = orderItemID;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
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

    public OrderItem(Product products, int unitPrice) {
        this.products = products;
        this.unitPrice = unitPrice;
    }

}
