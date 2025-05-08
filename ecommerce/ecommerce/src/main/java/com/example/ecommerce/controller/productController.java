package com.example.ecommerce.controller;

import com.example.ecommerce.model.*;
import com.example.ecommerce.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class productController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> products = productRepository.findAll();
        System.out.println("Số sản phẩm: " + products.size());
        model.addAttribute("products", products);
        return "products";
    }

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Hiển thị sản phẩm theo ID
    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "product-detail"; // tên file HTML
        } else {
            return "product-not-found";
        }
    }
}

