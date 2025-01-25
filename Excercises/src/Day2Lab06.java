// TASK: Peter wants to repaint the living room and has hired craftsmen for this purpose. Write a program that calculates the
//cost of repairs, given the following prices:
    // Protective nylon - 1.50 USD per square meter
    // Paint - 14.50 USD for liter
    // Paint thinner - 5.00 USD for a liter
//Just in case, to the necessary materials, Peter wants to add another 10% of the amount of paint and 2 square
//meters of nylon, of course, 0.40 USD for bags. The amount paid to the masters for 1 hour of work is equal to 30%
//of the sum of all costs for materials.
    //Input Data
        //The input is readable from the console and contains 4 lines:
        //1. Required amount of nylon (in square meters) – an integer in the range [1... 100]
        //2. Required amount of paint (in liters) – an integer in the range [1…100]
        //3. Quantity of detergent (in liters) – an integer in the range [1…30]
        //4. Hours for which the workers will do the work - an integer in the interval [1…9]
    //Output Data
        //On the console print:
        // "{total sum of all costs}";

import java.util.Scanner;

public class Day2Lab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonAmount = scanner.nextInt();
        int paintAmount = scanner.nextInt();
        int detergentAmount = scanner.nextInt();
        int workHours = scanner.nextInt();

        double nylonPrice = 1.5;
        double paintPrice = 14.5;
        double detergentPrice = 5.0;
        double bagsPrice = 0.4;

        double nylonSum = (nylonAmount + 2) * nylonPrice;
        double paintSum = (paintAmount * 1.1) * paintPrice;
        double detergentSum = detergentAmount * detergentPrice;

        double totalMaterialSum = nylonSum + paintSum + detergentSum + bagsPrice;
        double totalWorkerSum = (totalMaterialSum * 0.3) * workHours;

        double totalSum = totalMaterialSum + totalWorkerSum;

        System.out.println(totalSum);

        scanner.close();
    }
}
