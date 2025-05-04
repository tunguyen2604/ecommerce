package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int Products_id;
     
     String image;
     int type;
     String name ;
     int purchasePrice ;
     int quantity;
     int sellPrice ;
     int tax ;
    
     public Products(int products_id, String image, int type, String name, int purchasePrice, int quantity,
            int sellPrice, int tax) {
        Products_id = products_id;
        this.image = image;
        this.type = type;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.tax = tax;
    }
     public int getProducts_id() {
         return Products_id;
     }
     public void setProducts_id(int products_id) {
         Products_id = products_id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public int getPurchasePrice() {
         return purchasePrice;
     }
     public void setPurchasePrice(int purchasePrice) {
         this.purchasePrice = purchasePrice;
     }
     public int getSellPrice() {
         return sellPrice;
     }
     public void setSellPrice(int sellPrice) {
         this.sellPrice = sellPrice;
     }
     public int getTax() {
         return tax;
     }
     public void setTax(int tax) {
         this.tax = tax;
     }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



