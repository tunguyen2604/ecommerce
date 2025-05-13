package com.example.ecommerce.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
// @Entity
// @Table(name="order")
public class Orders {

    Long orderid;
    Date orderdate;
    double taxvat;
    double netamount;
    double totalamount;
    Long storestaffid;
    Long customerid;

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

    public double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(double totalAmount) {
        this.totalamount = totalAmount;
    }

    public int getStorestaffid() {
        return storestaffid;
    }

    public void setStorestaffid(int employeeid) {
        this.storestaffid = employeeid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Orders(int orderID, int customerID,  int totalAmount, short  status) {
        this.orderid = orderID;
        this.customerid = customerID;
        this.totalamount = totalAmount;
    }
}
