package com.example.ecommerce.model;


import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderid;
    Date orderdate;
    double taxvat;
    double netamount;
    double totalAmount;
    int employeeid;
    int customerid;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public double getTaxvat() {
        return taxvat;
    }

    public void setTaxvat(double taxvat) {
        this.taxvat = taxvat;
    }

    public double getNetamount() {
        return netamount;
    }

    public void setNetamount(double netamount) {
        this.netamount = netamount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public List<OrderItem> getList_OrderItems() {
        return list_OrderItems;
    }

    public void setList_OrderItems(List<OrderItem> list_OrderItems) {
        this.list_OrderItems = list_OrderItems;
    }

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    List<OrderItem> list_OrderItems = new ArrayList<>();
    public Order(int orderID, int customerID,  int totalAmount, short  status) {
        this.orderid = orderID;
        this.customerid = customerID;
        this.totalAmount = totalAmount;
    }

    public void addOrderItem(OrderItem orderItem1) {
        // TODO Auto-generated method stub
        list_OrderItems.add(orderItem1);
    }


}
