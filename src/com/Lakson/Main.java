package com.Lakson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void main(String[] args) {

        //Hello and welcome to my Store app!
        //For the purpose of showing my thought process, I intentionally left some testing commands as comments in the code.
        //Enjoy!

        PerishableItems item1 = new PerishableItems("apples", "BrandA", 1.50, "2021-06-14");
        PerishableItems item2 = new PerishableItems("milk", "BrandM", 0.99, "2022-02-22");
        ClothesItem item3 = new ClothesItem("T-shirt", "BrandT", 15.99, "M","violet");
        ApplianceItem item4 = new ApplianceItem("laptop", "BrandL", 2345, "ModelIL", "2021-03-03", 1.125);

        item1.addQuantity(2.45);
        item2.addQuantity(3);
        item3.addQuantity(2);
        item4.addQuantity(1);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItemToCart(item1);
        shoppingCart.addItemToCart(item2);
        shoppingCart.addItemToCart(item3);
        shoppingCart.addItemToCart(item4);

        //TESTING DATE
        /*LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String testdate = localDate.format(formatter2);
        System.out.println(testdate);*/

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Date: " + formatter.format(date));
        System.out.println("---Products---\n");

        //TESTING PRINT AND ANOTHER FORM OF DATE
       /* System.out.println(" ");
        System.out.println("test");
        Calendar cal = Calendar.getInstance();
        int today = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(today); */

        Cashier cashier = new Cashier();
        cashier.receipt(shoppingCart);
        System.out.println("DISCOUNT: =$"+ (item1.getDiscount() + item2.getDiscount() + item3.getDiscount() + item4.getDiscount())+"\n");
        System.out.println("TOTAL: $"+ (shoppingCart.getTotal() - (item1.getDiscount() + item2.getDiscount() + item3.getDiscount() + item4.getDiscount())));

    }
}
