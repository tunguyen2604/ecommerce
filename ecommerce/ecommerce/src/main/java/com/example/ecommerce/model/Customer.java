package com.example.ecommerce.model;


import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "customer") 
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int CustomerID;

    String name;
    String phone;
    String email;
    String address;
    Date DOB;

    public Customer(String name) {
        this.name = name;
    }

    public int getID() {
        return CustomerID;
    }
    public void setID(int customerID) {
        CustomerID = customerID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getDOB() {
        return DOB;
    }
    public void setDOB(Date dOB) {
        DOB = dOB;
    }
    
}
