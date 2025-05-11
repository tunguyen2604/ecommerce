package com.example.ecommerce.model;


//import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int CustomerID;

    @Column(name = "customerName", nullable = false)
    String customerName;

    @Column(name = "phone", nullable = false)
    String phone;
    String address;
    String cardNumber;

    public Customer(String name) {
        this.customerName = name;
    }

    public int getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
    public String getName() {
        return customerName;
    }
    public void setName(String name) {
        this.customerName = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /*public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }*/
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    /*public Date getDOB() {
        return DOB;
    }
    public void setDOB(Date dOB) {
        DOB = dOB;
    }*/
    
}
