package com.rbc.shopppingbasket;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingTillTest {

    @Test
    public void basketShouldCalculateTotalCostOfItems() {
        ShoppingTill shoppingTill = new ShoppingTill();
        Basket basket = new Basket();
        //add single items
        basket.addItem(Item.APPLE);
        basket.addItem(Item.BANANA);
        //now add multiple items in one go
        List<Item> items = new ArrayList<Item>();
        items.add(Item.LEMON);
        items.add(Item.BANANA);
        items.add(Item.ORANGE);
        items.add(Item.PEACH);
        items.add(Item.PEACH);
        items.add(Item.PEACH);
        items.add(Item.LEMON);
        basket.addItems(items);

        BigDecimal totalCost = shoppingTill.calculateTotalCost(basket.getItems());
        assertEquals(BigDecimal.valueOf(4.25), totalCost);

    }
}
