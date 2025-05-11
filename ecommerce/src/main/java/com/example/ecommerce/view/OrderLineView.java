package com.example.ecommerce.view;

public class OrderLineView {

    private String title;
    private String orderDate;
    private int quantity;
    // private double price;
    // private String status;
    // private int rate;
    public OrderLineView(String title, String orderDate, int quantity) {
        this.title = title;
        this.orderDate = orderDate;
        this.quantity = quantity;
        // this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
}
