package com.ims.dto;

import lombok.Data;

@Data
public class TransactionRequest {
    private Long productId;
    private Integer quantity;
    private Long userId;
}
