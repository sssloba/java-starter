// TASK: Write a program that calculates how much you will receive at the end of the deposit period at a certain interest rate.
//Use the following formula:
//amount = deposited amount + term of the deposit * ((deposited amount * annual interest rate) / 12)

import java.util.Scanner;

public interface Day2Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextFloat();
        int months = scanner.nextInt();
        float interestRate = scanner.nextFloat();

        float amount = deposit + months * ((deposit * interestRate / 100) / 12);
        System.out.println(amount);
        scanner.close();
    }
}
