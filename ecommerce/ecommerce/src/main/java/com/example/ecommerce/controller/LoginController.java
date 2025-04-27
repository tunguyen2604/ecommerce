package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Trả về login.html trong templates/
    }

    @PostMapping("/login")
    @ResponseBody
    public String doLogin(@RequestParam String username,
                          @RequestParam String password) {
        if ("admin".equals(username) && "123".equals(password)) {
            return "Đăng nhập thành công!";
        }
        return "Sai tên đăng nhập hoặc mật khẩu!";
    }
}
