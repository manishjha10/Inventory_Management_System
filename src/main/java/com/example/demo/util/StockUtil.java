package com.ims.util;

import com.ims.entity.Product;

public class StockUtil {

    public static boolean isLowStock(Product product) {
        return product.getQuantity() <= product.getThreshold();
    }

    public static int calculateNewStock(int current, int change, String type) {
        if ("IN".equals(type)) {
            return current + change;
        } else {
            return current - change;
        }
    }
}
