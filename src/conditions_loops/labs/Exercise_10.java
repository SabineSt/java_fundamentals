package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for(int x = 0; x < 20; x++){

            if(x == 10)continue;
            System.out.println("The value of your variable is " + x);
        }

    }
}

