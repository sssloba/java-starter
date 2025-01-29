// TASK: For his birthday, Steven received an aquarium in the shape of a parallelepiped. Initially, we read from the console in
    //separate rows its dimensions - length, width, and height in centimeters. It is necessary to calculate how many liters
    //of water the aquarium will collect if it is known that a certain percentage of its capacity is occupied by sand, plants,
    //heater, and pump.
    //One liter of water is equal to one cubic decimeter / 1l = 1 dm 3 /.
    //Write a program that calculates the liters of water needed to fill the aquarium.
        //Input Data
            //4 lines are read from the console:
            //1. Length in cm – an integer in the interval [10 … 500]
            //2. Width in cm – an integer in the interval [10 … 300]
            //3. Height in cm – an integer in the interval [10… 200]
            //4. Percentage – a floating-point number in the interval [0.000 … 100.000]
        //Output Data
            //Print a number on the console:
            // liters of water, that the aquarium contains.

import java.util.Scanner;

public class Day2Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        float percentage = scanner.nextFloat();

        double aquariumVolume = length * width * height;
        double volumeInLiters = aquariumVolume / 1000;
        double occupiedSpace = percentage / 100;

        double requiredLiters = volumeInLiters * (1 - occupiedSpace);

        System.out.println(requiredLiters);

        scanner.close();
    }
}
