// TASK: The restaurant opens its doors and offers several menus at preferential prices:
    //• Chicken menu – 10.35 USD.
    //• Fish menu – 12.40 USD.
    //• Vegetarian menu – 8.15 USD.
    //The group will also order a dessert, the price of which is equal to 20% of the total bill (excluding delivery).
    //The delivery price is 2.50 USD and is finally charged.
        //Input Data
            //3 lines are read from the console:
            // Number of chicken menus – an integer in the range [0 … 99]
            // Number of fish menus – an integer in the range [0 … 99]
            // Number of vegetarian menus – an integer in the range [0 … 99]
        //Output Data
            //Print one line on the console: &quot;{order price}&quot;:

import java.util.Scanner;

public class Day2Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenuAmount = scanner.nextInt();
        int fishMenuAmount = scanner.nextInt();
        int vegetarianMenuAmount = scanner.nextInt();

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegetarianMenuPrice = 8.15;
        double deliveryPrice = 2.5;

        double totalMenuPrice = chickenMenuAmount * chickenMenuPrice + fishMenuAmount * fishMenuPrice + vegetarianMenuAmount * vegetarianMenuPrice;

        double desertPrice = totalMenuPrice * 0.2;

        double totalPrice = totalMenuPrice + desertPrice + deliveryPrice;

        System.out.println(totalPrice);

        scanner.close();
    }
}
