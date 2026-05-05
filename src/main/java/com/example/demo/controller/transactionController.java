package com.ims.controller;

import com.ims.dto.TransactionRequest;
import com.ims.entity.Transaction;
import com.ims.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    // STOCK IN
    @PostMapping("/stock-in")
    public Transaction stockIn(@RequestBody TransactionRequest request) {
        return service.stockIn(
                request.getProductId(),
                request.getQuantity(),
                request.getUserId()
        );
    }

    // STOCK OUT
    @PostMapping("/stock-out")
    public Transaction stockOut(@RequestBody TransactionRequest request) {
        return service.stockOut(
                request.getProductId(),
                request.getQuantity(),
                request.getUserId()
        );
    }

    // HISTORY
    @GetMapping
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }
}
