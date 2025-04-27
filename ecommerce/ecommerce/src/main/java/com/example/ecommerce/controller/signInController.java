package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class signInController {
    @GetMapping("/signin")
    @PostMapping("/signin")
    public String getMethodName(@RequestParam String param) {
        return "signin";
    }

    
}
