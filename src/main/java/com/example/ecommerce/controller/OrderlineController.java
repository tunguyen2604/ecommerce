// package com.example.ecommerce.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.example.ecommerce.repository.OrderlineRepository;


// @Controller
// public class OrderlineController {

//     @Autowired
//     private OrderlineRepository orderLineRepository;

//     @GetMapping("/orderlines")
//     public String getOrderLines(@RequestParam("customerid") int customerid, Model model) {

//         // model.addAttribute("orderlines", orderLines);
//         return "orderlines"; // the name of your HTML page
//     }
// }
