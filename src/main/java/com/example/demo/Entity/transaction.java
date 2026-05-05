package com.ims.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // IN / OUT
    private Integer quantity;
    private LocalDateTime timestamp;
    private Long userId;

    private Long productId; // simple reference (no relation for now)
}
