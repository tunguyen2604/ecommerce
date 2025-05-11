package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
@DiscriminatorValue("book")
public class Book extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToOne
    @JoinColumn(name = "product_id")
    Product product;
    
    String isbn;
    String author;
    String publisher;
    
    public Book() {super();}

    public Book(Integer id, String name, Integer quantity, Double importprice, Double sellprice, String image,
            Double tax, String status, String description, Integer categoryid) {
        super(id, name, quantity, importprice, sellprice, image, tax, status, description, categoryid);
    }


    public Book(int id, String name, int quantity, double importprice, double sellprice, String image, double tax,
            String status, String description, int categoryid, int id2, String isbn, String author, String publisher) {
        super(id, name, quantity, importprice, sellprice, image, tax, status, description, categoryid);
        id = id2;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }


    public void displayBook(){
        System.out.println("title: "+this.name);
        //System.out.println("category: "+this.category);
        System.out.println("price: "+this.sellprice);
        System.out.println("quantity: "+this.quantity);
        System.out.println("author: "+this.author);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}



