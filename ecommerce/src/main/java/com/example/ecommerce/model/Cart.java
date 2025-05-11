package com.example.ecommerce.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
    @Id
    int id;

    ArrayList<Product> itemsOrdered;

    @OneToOne
    @MapsId // dùng chung khóa chính với Customer
    @JoinColumn(name = "id")
    private Customer customer;

    public Cart() {
        itemsOrdered = new ArrayList<>(); 
    }

    public void addProduct(Product p) {
        if(itemsOrdered.indexOf(p) == -1) itemsOrdered.add(p);
    }

    public void deleteProduct(Product p) {
        if(itemsOrdered.indexOf(p) != -1) itemsOrdered.remove(p);
    }

    public double totalCost() {
        double sum = 0;
        for (Product item : itemsOrdered) {
            sum+= item.getSellprice();
        }
        return sum;
    }

    public ArrayList<Product> getItemsOrdered() {
        return itemsOrdered;
    } 

}

