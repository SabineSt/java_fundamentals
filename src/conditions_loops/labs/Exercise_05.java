package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose 2 numbers: ");
        System.out.println();
        System.out.println("We will tell you the sum fromm the numbers in between and also tell you the average of them.");

        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        int sum = 0;

        if(lowerBound < upperBound) {
            for (int count = lowerBound; count <= upperBound; count++) {

                sum += count;

            }
            int av = sum / upperBound - lowerBound + 1;
            System.out.println("This is the sum of your numbers: " + sum);
            System.out.println("This is the average of your numbers: " + av);
        }
    }
}

//todo: kommt 50 raus, nicht 50.5 bei average

// könnt gleich lowerBound verwenden glaub ich