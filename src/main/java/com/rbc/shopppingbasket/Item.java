package com.rbc.shopppingbasket;

import java.math.BigDecimal;


enum Item {
    BANANA("Banana", BigDecimal.valueOf(0.25)),
    ORANGE("Orange", BigDecimal.valueOf(0.4)),
    APPLE("Apple", BigDecimal.valueOf(0.5)),
    LEMON("Lemon", BigDecimal.valueOf(0.3)),
    PEACH("Peach", BigDecimal.valueOf(0.75));

    private String description;
    private BigDecimal price;

    Item(String description, BigDecimal price){
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
