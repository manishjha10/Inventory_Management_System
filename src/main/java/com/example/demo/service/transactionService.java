package com.ims.service;

import com.ims.entity.Transaction;
import com.ims.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepo;

    // STOCK IN
    public Transaction stockIn(Long productId, int qty, Long userId) {
        Transaction t = new Transaction();
        t.setProductId(productId);
        t.setQuantity(qty);
        t.setType("IN");
        t.setTimestamp(LocalDateTime.now());
        t.setUserId(userId);

        return transactionRepo.save(t);
    }

    // STOCK OUT
    public Transaction stockOut(Long productId, int qty, Long userId) {
        Transaction t = new Transaction();
        t.setProductId(productId);
        t.setQuantity(qty);
        t.setType("OUT");
        t.setTimestamp(LocalDateTime.now());
        t.setUserId(userId);

        return transactionRepo.save(t);
    }

    // GET HISTORY
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }
}
