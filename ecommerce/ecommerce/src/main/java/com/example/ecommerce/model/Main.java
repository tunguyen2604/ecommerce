package com.example.ecommerce.model;

public class Main{
    public static void main(String[] args) {
    //ket tap
    Customer customer1 = new  Customer();
    Products giaiTich1 = new Book(0001, "giai tich 1", "abc");
    Products giaiTich11 = new Book(0002, "giai tich 1", "abc");
    Products giaiTich111 = new Book(0003, "giai tich 1", "abc");
    Inventory inventory = new Inventory();
    inventory.addBook(giaiTich1, 2);
    inventory.addBook(giaiTich11, 1);
    inventory.addBook(giaiTich111, 1);
    Order order1 = new Order(0001, customer1, 2000, (short) 1);
    OrderItem orderItem1 = new OrderItem(giaiTich1, 20000);
    order1.addOrderItem(orderItem1);
    inventory.inTTin();

    }
}