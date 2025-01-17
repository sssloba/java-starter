// Write a program that calculates how many hours it will take for an architect to design several construction projects. The preparation of a project takes three hours.
    //Input Data
        //2 lines are read from the console:
        //1.	Name of the architect – string
        //2.	Number of projects to be prepared – an integer in the interval [0 … 100]
    //Output Data
        //On the console print:
        //•	"The architect {name of architect} will need {needed time} hours to complete {number of projects} project/s."

import java.util.Scanner;

public class Day1Lab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int neededTimePerProjects = numberOfProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, neededTimePerProjects, numberOfProjects);
    }
}
