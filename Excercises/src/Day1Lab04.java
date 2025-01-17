// TASK: Write a program that reads text (person's name) from the console and prints "Hello, <name>!", where <name> is the name entered from the console.

import java.util.Scanner;

public class Day1Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
