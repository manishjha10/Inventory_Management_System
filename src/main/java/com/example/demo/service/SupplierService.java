package com.ims.service;

import com.ims.entity.Supplier;
import com.ims.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository repo;

    public Supplier addSupplier(Supplier supplier) {
        return repo.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return repo.findAll();
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {
        Supplier existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Supplier not found"));

        existing.setName(supplier.getName());
        existing.setEmail(supplier.getEmail());
        existing.setPhone(supplier.getPhone());
        existing.setAddress(supplier.getAddress());

        return repo.save(existing);
    }

    public void deleteSupplier(Long id) {
        repo.deleteById(id);
    }
}