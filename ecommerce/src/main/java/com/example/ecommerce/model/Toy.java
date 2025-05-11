package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "toy")
@DiscriminatorValue("toy")
public class Toy extends  Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToOne
    @JoinColumn(name = "product_id")
    Product product;

    String brand;
    String suitableage;

    public Toy() {super();}




    public Toy(Integer id, String name, Integer quantity, Double importprice, Double sellprice, String image,
            Double tax, String status, String description, Integer categoryid, Integer id2, Product product,
            String brand, String suitableage) {
        super(id, name, quantity, importprice, sellprice, image, tax, status, description, categoryid);
        id = id2;
        this.product = product;
        this.brand = brand;
        this.suitableage = suitableage;
    }



    public void displayImformation (){
        System.out.println("title: "+this.name);
        //System.out.println("category: "+this.category);
        System.out.println("suitable age: "+this.suitableage);
        //System.out.printf("cost: %.2f\n", this.cost);
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



    public String getSuitableage() {
        return suitableage;
    }



    public void setSuitableage(String suitableage) {
        this.suitableage = suitableage;
    }
    
}


