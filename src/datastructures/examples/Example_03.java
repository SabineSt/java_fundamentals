package datastructures.examples;

import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {

        // create array list of String
        ArrayList<String> obj = new ArrayList<String>();

        // add items to the array list
        obj.add("Ryan");
        obj.add("Kim");
        obj.add("Caden");

        // print out the array list
        System.out.println("Currently the arraylist has following elements:" + obj);

        // remove an item from the array list
        obj.remove("Caden");


        // print out modified array list
        System.out.println("Now the arraylist has following elements:" + obj);


    }
}

/*
class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<~>();

        obj.add("Ryan");
        obj.add("Kim");
        obj.add("Caden");

        System.out.println("Currently the arrylist has following elemenst:" + obj);

        obj.remove(2);

        System.out.println("Now the arraylist has following elements:" + obj);
    }
}
*/