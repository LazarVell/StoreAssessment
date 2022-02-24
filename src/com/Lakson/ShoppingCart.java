package com.Lakson;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List itemsInCart = new ArrayList();
    public double total = 0;

    public void addItemToCart(PerishableItems item) {
        this.itemsInCart.add(item);
        total = total + item.price;
    }

    public void addItemToCart(ClothesItem item) {
        this.itemsInCart.add(item);
        total = total + item.price;
    }

    public void addItemToCart(ApplianceItem item) {
        this.itemsInCart.add(item);
        total = total + item.price;
    }

    public double getTotal() {
        return this.total;
    }

    public void printItems() {
        for (int i=0; i<itemsInCart.size(); i++) {
            System.out.println(itemsInCart.get(i).toString());
        }
    }
}


