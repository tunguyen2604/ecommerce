package com.example.ecommerce.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.ecommerce.model.*;
import com.example.ecommerce.repository.ProductRepository;

@Controller
public class productController {
    private final ProductRepository productRepository;

    public productController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        Optional<Products> product = productRepository.findById(id);

        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "product-detail"; // tên file HTML
        } else {
            return "product-not-found";
        }
    }
}

