package com.example.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> itemsInStock = new ArrayList<Product>();

    public Inventory() {}
    public void addProduct(Product p) {
        itemsInStock.add(p);
    }
    public List<Product> getItemsInStock() {
        return itemsInStock;
    }
    public void setItemsInStock(List<Product> itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

}
