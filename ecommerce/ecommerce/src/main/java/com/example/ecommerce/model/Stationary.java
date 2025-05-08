package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stationary")
@DiscriminatorValue("stationary")
public class Stationary extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToOne
    @JoinColumn(name = "product_id")
    Product product;
    
    String brand;
    String type;

    public Stationary() {super();}


    public Stationary(Integer id, String name, Integer quantity, Double importprice, Double sellprice, String image,
            Double tax, String status, String description, Integer categoryid, Integer id2, Product product,
            String brand, String type) {
        super(id, name, quantity, importprice, sellprice, image, tax, status, description, categoryid);
        id = id2;
        this.product = product;
        this.brand = brand;
        this.type = type;
    }


    public void displayImformation(){
        System.out.println("name: "+this.name);
        System.out.println("category: "+this.type);
        System.out.println("brand: "+this.brand);
        //System.out.println("color: "+this.color);
        //System.out.printf("cost: %d\n", this.sellPrice);
    }


    public Integer getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }






    
}
