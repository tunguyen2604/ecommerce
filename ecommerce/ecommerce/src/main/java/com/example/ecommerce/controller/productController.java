package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class productController {
    @GetMapping("/product")
    public String hello() {
        return "product";
    }
}

