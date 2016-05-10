package com.rbc.shopppingbasket;


import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * holds shopping items
 */
public class Basket {

    private final List<Item> items = new CopyOnWriteArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItems(List<Item> items){
        this.items.addAll(items);
    }

    public List<Item> getItems(){
        return Collections.unmodifiableList(items);
    }
}
