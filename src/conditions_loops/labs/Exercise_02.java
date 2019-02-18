package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {

        // prompt user
        System.out.println("Please choose a number between 1 and 7 and press the Enter key");

        // assign input to variable as int
        int number = scanner.nextInt();

        // write completed code here

      if (number > 0 & number < 8){

            if (number > 1){

                if (number > 2){

                    if (number > 3){

                        if (number > 4){

                            if (number > 5){

                                if (number > 6){
                                    System.out.println("This number correlates with Sunday");
                                } else {
                                    System.out.println("This number correlates with Saturday");
                                }
                            } else {
                                System.out.println("This number correlates with Friday");
                            }
                        } else {
                            System.out.println("This number correlates with Thursday");
                        }
                    } else {
                        System.out.println("This number correlates with Wednesday");
                    }
                } else {
                    System.out.println("This number correlates with Tuesday");
                }
            } else {
                System.out.println("This number correlates with Monday");
            }
      } else {
          System.out.println("Please enter a number between 1 and 7");
      }
    }


        /* if (number > 0){
            if (number < 2){
                System.out.println("This number correlates with Monday");
            }
        } else if (number > 1){
            if (number < 3){
                System.out.println("This number correlates with Tuesday");
        }
        } else if (number > 2){
            if (number < 4){
                System.out.println("This number correlates with Wednesday");
            }
        } else if (number > 3){
            if (number < 5){
                System.out.println("This number correlates with Thursday");
            }
        } else if (number > 4){
            if (number < 6){
                System.out.println("This number correlates with Friday");
            }
        } else if (number > 5){
            if (number < 7){
                System.out.println("This number correlates with Saturday");
            }
        } else if (number > 6) {
            if (number < 8) {
                System.out.println("This number correlates with Sunday");
            }
        } else {
                System.out.println("You have chosen a completely different number! :P Try again! ;)");
            } */


       /*  switch (number) {
            case 1:
                System.out.println("This number correlates with Monday");
                break;
            case 2:
                System.out.println("This number correlates with Tuesday");
                break;
            case 3:
                System.out.println("This number correlates with Wednesday");
                break;
            case 4:
                System.out.println("This number correlates with Thursday");
                break;
            case 5:
                System.out.println("This number correlates with Friday");
                break;
            case 6:
                System.out.println("This number correlates with Saturday");
                break;
            case 7:
                System.out.println("This number correlates with Sunday");
                break;
            default:
                System.out.println("wrong number!");
                break;
          }

        }
    }
}*/



}}