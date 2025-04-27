package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Detail {

    @GetMapping("/Detail")
    public String hello() {
        return "Detail";
    }
}

