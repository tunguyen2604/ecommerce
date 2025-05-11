package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.repository.CustomerRepository;

@Controller
public class LoginController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Trả về login.html trong templates/
    }
    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model){
        Customer customer= customerRepository.findBycustomername(username);
        if (customer != null && customer.getPassword().equals(password)) {
            return "";
        } else{
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }

    }
    
}
