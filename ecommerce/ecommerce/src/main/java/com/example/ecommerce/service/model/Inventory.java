package com.example.ecommerce.service;


import java.util.HashMap;

public class Inventory {
    int lowStockTheshold;
    //List<Products> listProduct = new ArrayList<>();
    HashMap<Products, Integer> hashMap1 = new HashMap<>();
    public void addBook(Products products, Integer integer){
        hashMap1.put(products, integer);
      //  listProduct.add(products);
    }
    public void inTTin(){
        for (Products products : hashMap1.keySet()) {
            System.out.println(products.getName());
        } 
    }


}
