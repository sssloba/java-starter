// TASK: Write a program that reads the name, surname, age, and city from the console and prints the following message: "You are <firstName> <lastName>, a <age>-years old person from <town>."

import java.util.Scanner;

public class Day1Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
