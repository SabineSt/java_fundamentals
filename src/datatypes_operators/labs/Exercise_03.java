package datatypes_operators.labs;

import java.util.Scanner;
import java.lang.Character;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name here: ");

        String name = scanner.next();

        char aChar = name.charAt(0);

        char lowerCase = Character.toLowerCase(aChar);

        System.out.println(name.substring(1) + lowerCase + "ay");








//char c[] = str.toCharArray();

        // write code here
        //ex.3 : something with array [0] und add od einfach + ay zero idea wie das substring() funktioniert
        //aber es is sicher ne methode ein member vom string Objekt also „“.substring()  nein ohne klammern
        //String[] str = name.toCharArray();

        //String str = new String(name);


    }
}


