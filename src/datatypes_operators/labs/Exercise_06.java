package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];

        for (int t = 0; t < 5; t++) {
            for (int i = 0; i < 5; i++) {
                if(t == 0) twoDArray[t][i] = (i +1) *3;
                        //(i + 1 + 6 * t) * 3;
                if(t == 1)twoDArray[t][i] = (i +6) *3;
                if(t == 2)twoDArray[t][i] = (i +11) *3;
                if(t == 3)twoDArray[t][i] = (i +16) *3;
                if(t == 4)twoDArray[t][i] = (i +21) *3;

            }
       }

        for (int i = 0; i < 5; i++) {
            for (int t = 0; t < 5; t++) {
               System.out.print(twoDArray[i][t] + " ");
            }
            System.out.println();
        }
    }
}

//todo: mathematisch nicht hingehauen - 2te reihe