package com.ims.controller;

import com.ims.entity.Supplier;
import com.ims.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService service;

    // Add Supplier
    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return service.addSupplier(supplier);
    }

    // Get All Suppliers
    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return service.getAllSuppliers();
    }

    // Update Supplier
    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        return service.updateSupplier(id, supplier);
    }

    // Delete Supplier
    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id) {
        service.deleteSupplier(id);
    }
}