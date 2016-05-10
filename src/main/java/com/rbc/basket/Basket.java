package com.rbc.basket;


import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Basket {

    private final List<Item> items = new CopyOnWriteArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItems(List<Item> items){
        this.items.addAll(items);
    }

    public BigDecimal calculateTotalCost() {
        return items.stream().map(item -> item.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
