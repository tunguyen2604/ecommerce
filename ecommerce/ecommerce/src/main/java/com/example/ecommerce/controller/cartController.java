package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cartController {
    @GetMapping("/cart")
    public String cartPath(){
        return "cart"; // Trả về login.html trong templates/
    }

}
