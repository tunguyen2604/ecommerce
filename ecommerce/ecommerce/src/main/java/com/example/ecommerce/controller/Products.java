package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Products {


    @GetMapping("/Product")
    public String hello() {
        return "Product";
    }
}

