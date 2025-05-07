package com.example.ecommerce.model;



import jakarta.persistence.*;

@Entity
@Table(name = "customer") 
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerid;

    String customername;
    String firstname;
    String lastname;
    String gender;
    String cardnumber;
    String phone;
    String email;
    String address;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    Cart cart;

    public Customer() {
    }

    public Customer(String name) {
        this.customername = name;
    }

    public Customer(int customerID, String name, String phone, String email, String address) {
        customerid = customerID;
        this.customername = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        
    }

    public int getID() {
        return customerid;
    }
    public void setID(int customerID) {
        this.customerid = customerID;
    }
    public String getName() {
        return customername;
    }
    public void setName(String name) {
        this.customername = name;
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    
}
