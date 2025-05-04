package com.example.ecommerce.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecommerce.model.Book;
import com.example.ecommerce.model.Products;

@Controller
public class cartController {
    @GetMapping("/cart")
    public String cartPath(Model model){
            List<Products> cartItems = new ArrayList<>();
            Products book2 = new Book(2, "arya.jpg", 1, "Lập Trình Java Cơ Bản", 120000, 5, 150000, 100, "Công nghệ thông tin", "Nguyễn Văn A", "9786047746453");
            Products book1 = new Book(1, "arya.jpg", 1, "Hành Trình Về Phương Đông", 50000, 10, 70000, 100, "Tâm linh", "Baird T. Spalding", "9786047746452");
            Products book3 = new Book(3, "arya.jpg", 2, "Sapiens - Lược Sử Loài Người", 90000, 8, 120000, 100, "Lịch sử", "Yuval Noah Harari", "9786047746454");
            Products book4 = new Book(4, "arya.jpg", 2, "7 Thói Quen Hiệu Quả", 80000, 12, 110000, 100, "Kỹ năng sống", "Stephen R. Covey", "9786047746455");
            Products book5 = new Book(5, "arya.jpg", 1, "Clean Code", 150000, 6, 200000, 100, "Lập trình", "Robert C. Martin", "9786047746456");
            Products book6 = new Book(2, "arya.jpg", 1, "Lập Trình Java Cơ Bản", 120000, 5, 150000, 100, "Công nghệ thông tin", "Nguyễn Văn A", "9786047746453");
            Products book7 = new Book(1, "arya.jpg", 1, "Hành Trình Về Phương Đông", 50000, 10, 70000, 100, "Tâm linh", "Baird T. Spalding", "9786047746452");
            Products book8 = new Book(3, "arya.jpg", 2, "Sapiens - Lược Sử Loài Người", 90000, 8, 120000, 100, "Lịch sử", "Yuval Noah Harari", "9786047746454");
            Products book9 = new Book(4, "arya.jpg", 2, "7 Thói Quen Hiệu Quả", 80000, 12, 110000, 100, "Kỹ năng sống", "Stephen R. Covey", "9786047746455");
            Products book10 = new Book(5, "arya.jpg", 1, "Clean Code", 150000, 6, 200000, 100, "Lập trình", "Robert C. Martin", "9786047746456");
            cartItems.add(book1);
            cartItems.add(book2);
            cartItems.add(book3);
            cartItems.add(book4);
            cartItems.add(book5);
            cartItems.add(book6);
            cartItems.add(book7);
            cartItems.add(book8);
            cartItems.add(book9);
            cartItems.add(book10);

        model.addAttribute("cartItems", cartItems);
        return "cart"; // Trả về login.html trong templates/
    }

}
