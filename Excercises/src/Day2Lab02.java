// TASK: Write a program that reads an angle in radians (decimal number) and converts it to degrees.

import java.util.Scanner;

public class Day2Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = scanner.nextDouble();
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
        scanner.close();
    }
}
