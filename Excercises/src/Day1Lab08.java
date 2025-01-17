// TASK: Sophia has several houses on the Black Sea coast and wants to green the yards of some of them, thus creating a cozy atmosphere and comfort for its guests. She has hired a company for this purpose.
//Write a program that calculates the amount needed for Sophie to pay to the project contractor. The price per square meter is 7.61 USD including VAT. Because her yard is quite large, the contractor company offers an 18% discount on the final price.
    // Input Data
        //One line is read from the console:
        //1.	Square meters of the landscaped – a floating-point number in the range [0.00 … 10000.00]
    //Output Data
        //Two lines are printed on the console:
        //•	"The final price is: {final price of the service} USD."
        //•	"The discount is: {discount} USD."

import java.util.Scanner;

public class Day1Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float squareMeters = scanner.nextFloat();  // or -  float squareMeters = Float.parseFloat(scanner.nextLine());

        double price = squareMeters * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;

        System.out.println("The final price is: " + finalPrice +" USD.");
        System.out.println("The discount is: " + discount +" USD.");
    }
}
