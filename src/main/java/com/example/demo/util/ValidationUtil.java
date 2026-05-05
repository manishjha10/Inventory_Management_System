package com.ims.util;

import com.ims.entity.Product;

public class ValidationUtil {

    public static void validateProduct(Product p) {
        if (p.getName() == null || p.getName().isEmpty()) {
            throw new RuntimeException("Product name required");
        }
        if (p.getPrice() <= 0) {
            throw new RuntimeException("Invalid price");
        }
    }
}
