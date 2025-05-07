package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecommerce.model.OrderItem;
import com.example.ecommerce.repository.OrderLineRepository;


@Controller
public class OrderHistoryController {
    @Autowired
    private OrderLineRepository orderLineRepository;
    @GetMapping("/orderHistory")
    public String getMethodName(Model model, @RequestParam("customer_id") String customer_id) {
        List<OrderItem> order_lines = orderLineRepository.findBycustomer_id(customer_id);
        model.addAttribute("order_lines", order_lines);
        return "orderHistory";
    }
    

}
