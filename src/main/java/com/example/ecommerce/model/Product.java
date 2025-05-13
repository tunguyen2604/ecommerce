package com.example.ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long productid;
    String name ;
    int quantity;
    Double importprice;
    Double sellprice;
    String image;
    Double tax ;
    String status;
    String description;
    Long categoryid;

    public Product() {}
    
    public Long getProductid() {
        return productid;
    }
    public void setProductid(Long id) {
        this.productid = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int  getQuantity() {
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
    public Long getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }
    public Product(Long id, String name, int  quantity, Double importprice, Double sellprice, String image,
            Double tax, String status, String description, Long categoryid) {
        this.productid = id;
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



