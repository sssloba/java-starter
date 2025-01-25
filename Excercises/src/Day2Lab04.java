// TASK: There are several books on John’s list of required literature for the summer vacation. Because John prefers to play
//with friends outside, your task is to help him calculate how many hours a day he has to spend reading the necessary
//literature.
    // Input Data:
        //3 lines are read from the console:
        //1. Number of pages in the current book – an integer in the interval [1…1000]
        //2. Pages read in 1 hour - an integer in the interval [1…1000]
        //3. The number of days for which you must read the book - an integer in the range [1…1000]
    // Output Data:
        //To print on the console the number of hours that John has to spend reading each day.

import java.util.Scanner;

public class Day2Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = scanner.nextInt();
        int pagesPerHour = scanner.nextInt();
        int numberOfDaysPerBook = scanner.nextInt();

        // 1.way for float result
        // float totalHours = 1.0f * numberOfPages / pagesPerHour;
        //2.way for float result
        // float totalHours = (float) numberOfPages / pagesPerHour;
        int totalHours =  numberOfPages / pagesPerHour;
        int requiredHoursPerDay = totalHours / numberOfDaysPerBook;

        System.out.println(requiredHoursPerDay);
        scanner.close();
    }
}
