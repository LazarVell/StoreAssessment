package com.Lakson;

import java.util.Calendar;

public class ClothesItem extends Item {

    private final String size;
    private final String color;
    private double quantity;
    private double discount;
    private double discountCounter;
    private double total;

    public ClothesItem(String name, String brand, double price, String size, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    /*
    // getSize and getColor are not needed for this exercise, but we would use them if we needed to print out color and size.
    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }*/

    public void addQuantity ( double quantity) {
        this.quantity = quantity;
    }

    public double total ( double quantity, double price) {
        this.total = quantity * price;
        double roundedTotal = Math.round(total * 100);
        roundedTotal = roundedTotal / 100;
        return roundedTotal;
    }

   public double discount() {
        this.discount = 0;
        this.discountCounter = 0;
       Calendar cal = Calendar.getInstance();
       int today = cal.get(Calendar.DAY_OF_WEEK);
       //Calendar.DAY_OF_WEEK returns value of 3 for Tuesday and 7 for Saturday
        if (today <= 4 || today >= 7) {
            discountCounter = 0.1;
            this.discount = total(quantity, price) * discountCounter;
        }

        double roundedDiscount = Math.round(discount * 100);
        roundedDiscount = roundedDiscount/100;
        discount = roundedDiscount;
        return discount;
    };

    public double getDiscount() {
        return this.discount;
    }

    @Override
    public String toString() {
        discount();
        String returnString = this.getName() + " " + this.getBrand() + "\n" +
                this.quantity+ " x $" + this.price + " = $" + total(quantity, price);
        String finalString = returnString +"\n";

        if (this.discount != 0) {
            String discountString = "\n" +
                    "#discount " + ((int)(discountCounter *100)) + "% -$"+ this.discount;
            finalString = returnString + discountString +"\n";
        };
        return finalString;
    }
}
