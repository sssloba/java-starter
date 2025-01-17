// Write a program that calculates the cost of buying dog and cat food. The food is bought from a pet store, as one package of dog food costs 2.50 USD, and a package of cat food costs 4 USD.
    //Input Data
        //2 lines are read from the console:
        //1.	Number of packages of dog food - an integer in the range [0… 100]
        //2.	Number of packages of cat food - an integer in the range [0… 100]
    //Output Data
        //On the console print:
        //"{Total sum} USD"

import java.util.Scanner;

public class Day1Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());
        double totalCosts = dogFoodPackages * 2.5 + catFoodPackages * 4;
        System.out.println(totalCosts + " USD");
    }
}
