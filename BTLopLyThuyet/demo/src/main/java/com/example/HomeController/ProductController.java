package com.example.HomeController;

import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @Controller
 */
// src/main/java/com/example/ecommerce/controller/ProductController.java
public class ProductController {
    @GetMapping("/")
    public String index() {
        return "products"; // Trả về file products.html
    }
}
