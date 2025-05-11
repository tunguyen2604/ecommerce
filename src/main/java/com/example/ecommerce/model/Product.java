package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name ;
    Integer quantity;
    Double importprice;
    Double sellprice;
    String image;
    Double tax ;
    String status;
    String description;
    Integer categoryid;

    public Product() {}
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getImportprice() {
        return importprice;
    }
    public void setImportprice(Double importprice) {
        this.importprice = importprice;
    }
    public Double getSellprice() {
        return sellprice;
    }
    public void setSellprice(Double sellprice) {
        this.sellprice = sellprice;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
    public Product(Integer id, String name, Integer quantity, Double importprice, Double sellprice, String image,
            Double tax, String status, String description, Integer categoryid) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.importprice = importprice;
        this.sellprice = sellprice;
        this.image = image;
        this.tax = tax;
        this.status = status;
        this.description = description;
        this.categoryid = categoryid;
    }
    
     
}



