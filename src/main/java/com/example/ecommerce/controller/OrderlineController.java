package com.example.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecommerce.repository.OrderlineRepository;
import com.example.ecommerce.view.OrderLineView;


@Controller
public class OrderlineController {

    @Autowired
    private OrderlineRepository orderLineRepository;

    @GetMapping("/orderlines")
    public String getOrderLines(@RequestParam("customer_id") int customerId, Model model) {
        List<Object[]> rawData = orderLineRepository.fetchJoinedOrderItems(customerId);
        List<OrderLineView> orderLines = new ArrayList<>();

        for (Object[] row : rawData) {
            OrderLineView view = new OrderLineView(
                (String) row[0],                // name
                row[1].toString(),              // orderDate (convert Date to String)
                (Integer) row[2],               // quantity
                ((Number) row[3]).doubleValue() // sellPrice
            );
            orderLines.add(view);
        }

        model.addAttribute("orderlines", orderLines);
        return "orderlines"; // the name of your HTML page
    }
}
