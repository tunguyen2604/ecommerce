package com.example.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orderlines")
public class Orderlines {
    @Id
    int OrderItemID;

    @ManyToOne
    @JoinColumn(name = "id")
    Product products;
    @ManyToOne
    @JoinColumn
    private Orders orders;

    @Column(name="orderid")
    Integer orderid;
    @Column(name="quantity")
    int quantity;
    
    int unitPrice;
    String customerid;
    String productName;
    String productImage;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Orders order;

    public Orderlines(int orderItemID, Product products, Orders orders, Integer orderid, int quantity, int unitPrice,
            String customerid, String productName, String productImage, Orders order) {
        OrderItemID = orderItemID;
        this.products = products;
        this.orders = orders;
        this.orderid = orderid;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.customerid = customerid;
        this.productName = productName;
        this.productImage = productImage;
        this.order = order;
    }
    public void setOrderItemID(int orderItemID) {
        OrderItemID = orderItemID;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int soldQuantity) {
        this.quantity = soldQuantity;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String getCustomerid() {
        return customerid;
    }
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductImage() {
        return productImage;
    }
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public Orders getOrder() {
        return order;
    }
    public void setOrder(Orders order) {
        this.order = order;
    }
    public int getOrderItemID() {
        return OrderItemID;
    }
    public void setcustomerid(String customerid) {
        this.customerid = customerid;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
    public String getproductName() {
        return productName;
    }
    public void setproductName(String productName) {
        this.productName = productName;
    }
    public String getproductImage() {
        return productImage;
    }
    public void setproductImage(String productImage) {
        this.productImage = productImage;
    }

    public Orderlines(Product products, int unitPrice) {
        this.products = products;
        this.unitPrice = unitPrice;
    }

    
}
