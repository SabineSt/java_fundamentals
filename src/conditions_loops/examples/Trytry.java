package conditions_loops.examples;
/*
1
public class Trytry {

    public static void main(String[] args)
        trows java.io.IOException {

      char ch;

            System.out.println("Press a key followed ba ENTER:  ");

            ch = (char) System.in.read();

            System.out.println("Your key is: " + ch);
        }

}

2
class Guess {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch, answer = 'K';

            System.out.println("Im thinkin gof a letter between A and Z.");
            System.out.println("Can you guess it:  ");

            ch = (char) System.in.read();

            if (ch == answer) System.out.println("** Right **");
        }
    }
}

3
class Guess2 {
    public static void main(String args[])
        throws java.io.IOException {

            char ch; answer = 'K';

            System.out.println("Im thinking of a letter betwenn A and Z.");
            System.out.println("Can you guess it");

            ch = (char) System.in.read();

            if (ch == answer) System.out.println("** Right **");
            else System.out.println("...Sorry, you're wrong.");
        }
}

4
class Guess 3 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Im thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you re ");

            if(ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }

        }
        }

5
class Ladder {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x is one");
            else if (x == 2)
                System.out.println("x is two");
            System.out.println("x is two");
            else if (x == 3)
                System.out.println("x is three");
            else if (x == 4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and 4");
        }
    }
}

6
class SwitchDemo {
    public static void main (String[] args) {
        int i;

        for(i = 0; i < 10; i++)
            switch(i) {

                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                case 5:
                    System.out.println("i is five");
                    break;
                default:
                    System.out.println("i is five or more");
            }
    }
}

7
class NoBreak {
    public static void main(String[] args) {
        int i;

        for(i = 0; i <= 5; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is less than one");

            }
    }
}

10
class Help {
    public static void main(String args[])
        throws java.io.IOException {

        char choice;

        System.out.println("Help on: ");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Choose one: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("   case constant:");
                System.out.println( "   statement sequence");
                System.out.println("   break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found.");
        }

    }
}

11
class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " sroot);

            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}

12
class DecrFor {
    public static void main(String[] args) {
        int x;

        for(x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

14
class Comma {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}

15
class ForTest {
    public static void main(String[] args)
    throws java.io.IOException {

        int i;

        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" +i);
    }
}

16
class Empty {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}

17
class Empty2 {
        public static void main(String args[]) {
            int i;

            i = 0;
            for(; i < 10; ) {
                System.out.println("Pass #" + i);
                i++;
            }
        }
}

18
class Empty 3 {
        public static void main(String args[]) {
            int i;
            int sum = 0;

            for(i = 1; i <= 10000; sum += i++);
        }
    }

19
class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;


        for(int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        System.out.println("Sum is  " + sum);
        System.out.println("Factorial is " + fact);


        }
    }
}

20
class WhileDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
    }
}

21
class Power {
    public static void main(String[] args) {
        int e;
        int result;

        for(int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while(e > 0) {
                result *= 2;
                e--;
            }

            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}

22
class DWDemo {
    public static void main(String[] args)
    throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key following by ENTER: ");
            ch = (char) System.in.read();
        } while(ch != 'q');

    }
}

23
class Guess4 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Im thinking of a letter between A and Z");
            System.out.print("Can you guess it: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if(ch == answer)
                System.out.println("** Right **");
            else {
                System.out.println("...Sorry, you're");

                if(ch < answer)
                    System.out.println("too low");
                else
                    System.out.println("too high");

                System.out.println("Try again!\n");
            }
        } while(answer != ch);
    }
}

24
class Help2 {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Help on: ");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("   3. for");
            System.out.println("   4. while");
            System.out.println("   5. do-while");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if : \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("   case constant:");
                System.out.println("    statement sequence");
                System.out.println("   break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for: \n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("  statement;");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("   statement;");
                System.out.println("} while (condition);");
                break;
            }
        }
    }

25
class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        for(int i = 0; i < num; i++) {
            if( i*i >= num) break;
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}

26
class Break2 {
    public static void main(String[] args)
    throws java.io.IOException {

        char ch;

        for( ; ; ) {
            ch = (char) System.in.read();
            if(ch == 'q') break;
        }
        System.out.println("You pressed q!");

    }
}

27
class Break3 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.println("    Inner loop count: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete");
    }
}

28
class Break4 {
    public static void main(String[] args) {
        int i;

        for( i = 1; i < 4; i++) {
            one: {
                two: {
                  three: {
                      System.out.println("\ni is " + i);
                      if(i == 1) break one;
                      if(i == 2) break two;
                      if(i == 3) break three;

                      System.out.println("wont print");
                }
                    System.out.println("After block three.");
            }
                System.out.println("After block two");
            }
            System.out.println("After block one.");
        }
        System.out.println("After for");
    }
}

29
class Break5 {
    public static void main(String[] args) {

        done:
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done;
                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");
        }
        System.out.println("After i loop");
    }
}

30
class Break6 {
    public static void main(String[] args) {
        int x = 0, y = 0;

        stop1: for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();

        for(x = 0; x < 5; x++)
            stop2: {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop2;
                System.out.println("x and y: " + x + " " + y);
            }
            }
    }
}

31
class BreakErr {
    public static void main(String[] args) {

        one: for(int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        }
    }
}

32
class ContDemo {
    public static void main(String[] args) {
        int i;

        for(i = 0; i <= 100; i++) {
            if((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}

33
class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for(int i = 1; i < 10; i++) {
            System.out.println("\nOUter loop pass " + i + ", Inner loop: ");
            for(int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}

34
class Help3 {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;

        for(;;) {
            do {
                System.out.println("Help on:");
                System.out.println("   1. if");
                System.out.println("   2. switch");
                System.out.println("   3. for");
                System.out.println("   4. while");
                System.out.println("   5. do-while");
                System.out.println("   6. break");
                System.out.println("   7. continue\n");
                System.out.println("Choose one (q to quit): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;

            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("The if: \n");
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The switch: \n");
                    System.out.println("switch(expression) {");
                    System.out.println("   case constant:");
                    System.out.println("    statement sequence");
                    System.out.println("    break;");
                    System.out.println("  // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("The for: \n");
                    System.out.println("for(init; condition; iteration");
                    System.out.println(" statement;");
                    break;
                case '4':
                    System.out.println("The while: \n");
                    System.out.println("while(condition) statement");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("   statement;");
                    System.out.println("} while (condition);");
                    break;
                case '6':
                    System.out.println("The breack:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("The continue: \n");
                    System.out.println("continue; or continue label;");
                    break;
            }
            System.out.println();
        }
    }
}

35
class FindFac {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++) {
            System.out.println("Factors of " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}

*/