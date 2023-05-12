package com.example.springbootherokustarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping("/main")
    public String index() {
        return "main";
    }

}
