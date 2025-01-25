// TASK: Write a program for converting US dollars (USD) into Bulgarian levs (BGN). Use a fixed exchange rate between the
//dollar and the lev: 1 USD = 1.79549 BGN.

import java.util.Scanner;

public class Day2Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double bgn = usd * 1.79549;
        System.out.println(bgn);
        scanner.close();
    }
}
