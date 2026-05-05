package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping("/public")
    public String publicData() {
        return "Dashboard Working ✅";
    }
}