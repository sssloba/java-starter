// TASK: calculates and prints the area of a rectangle with predefined sides a and b.

import java.util.Scanner;

public class Day1Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // or int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println(area);
    }
}
