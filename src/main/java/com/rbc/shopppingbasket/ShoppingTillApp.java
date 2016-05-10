package com.rbc.shopppingbasket;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingTillApp {

    public static void main(String args[]){
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
        items.add(Item.PEACH);
        items.add(Item.PEACH);
        items.add(Item.LEMON);
        basket.addItems(items);

        BigDecimal totalCost = shoppingTill.calculateTotalCost(basket.getItems());

        System.out.println("Total cost of shopping basket is: " + totalCost);
    }

}
