package com.example.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> itemsInStock = new ArrayList<Product>();

    public Inventory() {}
    public void addProduct(Product p) {
        itemsInStock.add(p);
    }
}
