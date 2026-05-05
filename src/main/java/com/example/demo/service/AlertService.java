package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertService {

    private final ProductRepository repo;

    public AlertService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getTopSelling() {
        return repo.findTop5ByOrderBySoldCountDesc();
    }

    public List<Product> getLowStockProducts() {
        return repo.findByQuantityLessThan(10);
    }
}