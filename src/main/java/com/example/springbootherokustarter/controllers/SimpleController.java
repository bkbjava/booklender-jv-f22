package com.example.springbootherokustarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping("/main")
    public String index() {
        return "main";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registrationPage() {
        return "register";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
