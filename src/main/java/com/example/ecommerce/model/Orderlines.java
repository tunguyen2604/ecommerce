package com.example.ecommerce.model;

public class Orderlines {
    Long id;
    Long orderid;
    Long orderlineid;
    int quantity;    
    int unitPrice;
    Long customerid;
    String productName;
    String productImage;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderid() {
        return orderid;
    }
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
    public Long getOrderlineid() {
        return orderlineid;
    }
    public void setOrderlineid(Long orderlineid) {
        this.orderlineid = orderlineid;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Long getCustomerid() {
        return customerid;
    }
    public void setCustomerid(Long customerid) {
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
    public Orderlines(Long id, Long orderid, Long orderlineid, int quantity, int unitPrice, Long customerid,
            String productName, String productImage) {
        this.id = id;
        this.orderid = orderid;
        this.orderlineid = orderlineid;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.customerid = customerid;
        this.productName = productName;
        this.productImage = productImage;
    }
}
