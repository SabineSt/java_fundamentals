package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        int[][] irregularOne = {
                {1, 3},
                {4, 6, 7},
                {9, 10, 11, 34},
                {44, 54, 67, 59, 59}
        };


        for(int[] i : irregularOne) {
            for(int t : i) {
                System.out.println(t);
            }
        }
    }
}


/*
        int[][] anyNameIlike = {{1, 2}, {3, 4}};


        for (int i = 0; i < 2; i++) {
            for (int t = 0; t < 2; t++) {
                System.out.println(anyNameIlike[i][t]);
            }
        }
    }}*/

//todo look through it again - remember