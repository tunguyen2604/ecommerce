package com.example.ecommerce.model;


import java.util.HashMap;

public class Inventory {
    int lowStockTheshold;
    
    public int getLowStockTheshold() {
        return lowStockTheshold;
    }
    public void setLowStockTheshold(int lowStockTheshold) {
        this.lowStockTheshold = lowStockTheshold;
    }
    public HashMap<Products, Integer> getHashMap1() {
        return hashMap1;
    }
    public void setHashMap1(HashMap<Products, Integer> hashMap1) {
        this.hashMap1 = hashMap1;
    }
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
