 // TASK: The school year has already started and the head of the 10B class - Sophie has to buy a certain number of packets of
 //pens, packets of markers, and detergent for cleaning the board. She is a regular customer of a bookstore, so there
 //is a discount for her, which is a percentage of the total. Write a program that calculates how much money Sophie
 //will have to raise to pay the bill, keeping in mind the following price list:
     //• Package of pens- 5.80 USD.
     //• Package of markers - 7.20 USD.
     //• Detergent- 1.20 USD (for liter)
         //Input Data
             //4 numbers are read from the console:
             // Package of pens - an integer in the range [0...100]
             // Package of markers – an integer in the range [0...100]
             // Liters of detergent – an integer in the range [0…50]
             // Percentage reduction – an integer in the range [0...100]
         // Output Data
             //Print on the console how much money Sophie will need to pay her bill.

import java.util.Scanner;

public class Day2Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensPack = scanner.nextInt();
        int markersPack = scanner.nextInt();
        int detergentLiters = scanner.nextInt();
        int reductionPercents = scanner.nextInt();

        double totalPrice = pensPack * 5.8 + markersPack * 7.2 + detergentLiters * 1.2;
        double discountedPrice = totalPrice * (100 - reductionPercents) / 100;
        System.out.println(discountedPrice);

        scanner.close();
    }
}
