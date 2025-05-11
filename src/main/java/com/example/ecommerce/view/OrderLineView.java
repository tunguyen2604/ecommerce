package com.example.ecommerce.view;

public class OrderLineView {

    private String name;
    private String orderdate;
    private Integer quantity;
    private  double  sellprice;
    // private double price;
    // private String status;
    // private int rate;
    public OrderLineView(String name, String orderdate, int quantity, double sellprice) {
        this.name = name;
        this.orderdate = orderdate;
        this.quantity = quantity;
        this.sellprice = sellprice;
        // this.price = price;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
}
