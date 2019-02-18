package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(int z = 3456; z >= 999; z--){
            System.out.println(z);

            if(z == 3000)break;
        }

    }
}
