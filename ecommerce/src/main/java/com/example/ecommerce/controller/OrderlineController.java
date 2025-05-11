package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecommerce.model.Orderlines;
import com.example.ecommerce.repository.OrderLineRepository;


@Controller
public class OrderlineController {
    @Autowired
    private OrderLineRepository orderLineRepository;
    @GetMapping("/orderlines")
    public String getMethodName(Model model, @RequestParam("customer_id") String customer_id) {
        List<Orderlines> order_lines = orderLineRepository.fetchJoinedOrderItems();
        model.addAttribute("orderlines", order_lines);
        return "orderlines";
    }
    

}
