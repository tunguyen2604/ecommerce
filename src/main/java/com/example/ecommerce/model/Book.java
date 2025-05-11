package com.example.ecommerce.model;

public class Book extends Products {
    private String category = "null";
    private String author = "null";
    private String isbn ;
    
    

    
    public Book(int products_id, String image, int type, String name, int purchasePrice, int quantity, int sellPrice,
            int tax, String category, String author, String isbn) {
        super(products_id, image, type, name, purchasePrice, quantity, sellPrice, tax);
        this.category = category;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook(){
        System.out.println("title: "+this.name);
        System.out.println("category: "+this.category);
        System.out.println("price: "+this.sellPrice);
        System.out.println("quantity: "+this.quantity);
        System.out.println("author: "+this.author);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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



