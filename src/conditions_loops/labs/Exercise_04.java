package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        for (int x = 2; x < 101; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

    }
}


