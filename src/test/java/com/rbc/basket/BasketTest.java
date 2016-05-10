package com.rbc.basket;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void basketShouldCalculateTotalCostOfItems() {
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

        BigDecimal totalCost = basket.calculateTotalCost();
        assertEquals(4.25, totalCost);

    }
}
