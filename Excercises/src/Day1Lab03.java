// TASK: Read floating-point number from the console and converts it from inches to centimeters.

import java.util.Scanner;

public class Day1Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inches = scanner.nextFloat();
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
