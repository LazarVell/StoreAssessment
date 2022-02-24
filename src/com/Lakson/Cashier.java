package com.Lakson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cashier {

    public void receipt (ShoppingCart shoppingCart){

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

        shoppingCart.printItems();

        System.out.println("-----------------------------------------\n");
        System.out.println("SUBTOTAL: $" + shoppingCart.getTotal());

    }
}
