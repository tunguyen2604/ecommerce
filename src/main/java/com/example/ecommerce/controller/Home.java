package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {
    @GetMapping("/")
public String home() {
    return "index"; // không cần .html
}

}
