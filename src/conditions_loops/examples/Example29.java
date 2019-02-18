package conditions_loops.examples;

// Another example of using break with a label.
class Break5 {
    public static void main(String args[]) {

        done:
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done; // jump to done
                }
                System.out.println("After k loop"); // won't execute
            }
            System.out.println("After j loop"); // won't execute
        }
        System.out.println("After i loop");
    }
}

//todo look again or ask roi; why 5 is printed, other ex not, f.e.:31 u 30