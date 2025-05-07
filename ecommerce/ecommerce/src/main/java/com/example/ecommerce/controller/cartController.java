package com.example.ecommerce.controller;
import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecommerce.model.*;
import com.example.ecommerce.repository.*;

@Controller
@RequestMapping("/cart")
public class cartController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public String viewCart(Model model, Principal principal) {
        // Lấy username của người dùng đã đăng nhập
        String customername = principal.getName();

        // Tìm người dùng trong DB
        Customer customer = customerRepository.findBycustomername(customername);
        if (customer == null || customer.getCart() == null) {
            model.addAttribute("error", "Không tìm thấy giỏ hàng.");
            return "cart";
        }

        // Lấy danh sách item trong giỏ
        ArrayList<Product> items = customer.getCart().getItemsOrdered();

        // Thêm dữ liệu vào model để hiển thị trên view
        model.addAttribute("itemsOrdered", items);

        return "cart";  
    }
}

