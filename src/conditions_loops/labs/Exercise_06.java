package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers from 1-100. Print the sum to the console
 *
 */

 public class Exercise_06 {
    public static void main(String[] args){

        int x = 1;
        int y = 0;


        while(x < 101){

            y += x;
            x++;

        }
        System.out.println(y);

    }
}

// its one more if I change the order; so the first loop = 1 not calculated in, because checks at the end??