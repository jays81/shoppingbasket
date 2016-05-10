package com.rbc.shopppingbasket;

import java.math.BigDecimal;
import java.util.List;

/**
 * calculates cost of a basket of items
 */
public class ShoppingTill {


    public BigDecimal calculateTotalCost(List<Item> items) {
        return items.stream().map(item -> item.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
