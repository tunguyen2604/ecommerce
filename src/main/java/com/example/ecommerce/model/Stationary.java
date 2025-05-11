package com.example.ecommerce.model;

public class Stationary extends Products {
    private int stationary_id;
    private String brand= "null";
    private String color = "null";


    
  
    public Stationary(int products_id, String image, int type, String name, int purchasePrice, int quantity,
            int sellPrice, int tax, int stationary_id, String brand, String color) {
        super(products_id, image, type, name, purchasePrice, quantity, sellPrice, tax);
        this.stationary_id = stationary_id;
        this.brand = brand;
        this.color = color;
    }




    public void displayImformation(){
        System.out.println("name: "+this.name);
        System.out.println("category: "+this.type);
        System.out.println("brand: "+this.brand);
        System.out.println("color: "+this.color);
        System.out.printf("cost: %d\n", this.sellPrice);
    }




    public int getStationary_id() {
        return stationary_id;
    }




    public void setStationary_id(int stationary_id) {
        this.stationary_id = stationary_id;
    }




    public String getBrand() {
        return brand;
    }




    public void setBrand(String brand) {
        this.brand = brand;
    }




    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }


    
}
