package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class signInController {
    @GetMapping("/signin")
    public String signinPage() {
        return "signin";
    }
    @PostMapping("/signin")
    @ResponseBody
    public String doSignin(@RequestParam String username, 
                            @RequestParam String password){
        if ("admin".equals(username) && "123".equals(password)) {
            return "Đăng nhập thành công!";
        }
        return "Sai tên đăng nhập hoặc mật khẩu!";
    }
}
