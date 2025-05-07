package com.example.ecommerce.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    private String customer_id;
    private String order_id;
    private String product_name;
    private String product_image;
    private double product_price;
    private int quantity;
    private double total_price;
    private String status;
    private LocalDate delivery_date;
    private Boolean rating_status;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getcustomer_id() {
        return customer_id;
    }
    public void setcustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public String getOrder_id() {
        return order_id;
    }
    public void setOrder_id(String orderId) {
        this.order_id = orderId;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String productName) {
        this.product_name = productName;
    }
    public String getProduct_image() {
        return product_image;
    }
    public void setProduct_image(String productImage) {
        this.product_image = productImage;
    }
    public double getProduct_price() {
        return product_price;
    }
    public void setProduct_price(double productPrice) {
        this.product_price = productPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(double totalPrice) {
        this.total_price = totalPrice;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDate getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(LocalDate deliveryDate) {
        this.delivery_date = deliveryDate;
    }
    public Boolean getRating_status() {
        return rating_status;
    }
    public void setRating_status(Boolean ratingStatus) {
        this.rating_status = ratingStatus;
    }
    public OrderItem(String id, String customer_id, String orderId, String productName, String productImage,
            double productPrice, int quantity, double totalPrice, String status, LocalDate deliveryDate,
            Boolean ratingStatus) {
        this.id = id;
        this.customer_id = customer_id;
        this.order_id = orderId;
        this.product_name = productName;
        this.product_image = productImage;
        this.product_price = productPrice;
        this.quantity = quantity;
        this.total_price = totalPrice;
        this.status = status;
        this.delivery_date = deliveryDate;
        this.rating_status = ratingStatus;
    }
    
}
