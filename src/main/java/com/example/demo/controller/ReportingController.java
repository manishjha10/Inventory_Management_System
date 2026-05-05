package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportingController {

    private final AlertService service;

    public ReportingController(AlertService service) {
        this.service = service;
    }

    @GetMapping("/top-selling")
    public List<Product> getTopSelling() {
        return service.getTopSelling();
    }

    @GetMapping("/low-stock")
    public List<Product> getLowStock() {
        return service.getLowStockProducts();
    }
}