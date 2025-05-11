package com.example.ecommerce.model;

import java.util.ArrayList;

public class Cart {
    Long customerid;
    ArrayList<Product> itemsOrdered;

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

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public void setItemsOrdered(ArrayList<Product> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    } 
    

}

