package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class OrderItem {
    @Id
    int OrderItemID;

    @OneToOne
    @JoinColumn(name = "OrderItemID")
    Product products;
    int soldQuantity;
    int unitPrice;
    String customerid;
    String productName;
    String productImage;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    public void setOrderItemID(int orderItemID) {
        OrderItemID = orderItemID;
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
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
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

    public OrderItem(Product products, int unitPrice) {
        this.products = products;
        this.unitPrice = unitPrice;
    }

    
}
