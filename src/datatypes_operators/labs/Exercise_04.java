package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers");

        int sum = 0;

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        for (int i : numbers) {

            sum += i;
        }
        int av = sum / 10;

        System.out.println("This is the sum of your number: " + sum + "\nThis is the average of your choosen numbers: " + av);

    }
}

// todo look through again