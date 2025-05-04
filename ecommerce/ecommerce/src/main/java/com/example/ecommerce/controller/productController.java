package com.example.ecommerce.controller;

import com.example.ecommerce.model.*;
import com.example.ecommerce.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Hiển thị sản phẩm theo ID
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

