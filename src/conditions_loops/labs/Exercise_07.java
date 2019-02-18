package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */
//todo look through it again

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare variables

        System.out.println("Please enter your name: ");

        String name = scanner.next();

        char[] chars = name.toCharArray();

        int counter = 0;
        int max = chars.length;


        while(counter < max){
            if (chars[counter] == 'a' || chars[counter] =='e' || chars[counter] =='i' || chars[counter] =='o' || chars[counter] =='u'){

                System.out.println(name);
                System.out.println(chars[counter]);
                break;
            }
            counter++;
        }



    }
}


/*

String[0] !=   == a, e , i, o , u

int search = "hello".indexOf("o"); // searches "hello" for substring "o" and returns index of first match. Returns -1 if not found

*/