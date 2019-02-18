package objects_classes_methods.examples.ext;

class MyClass {

    private int alpha; // private access
    private int beta; // public access
    private int gamma; // default access

    /* Methods to access alpha.  It is OK for a
       member of a class to access a private member
       of the same class.
    */

    public void setAlpha(int alpha){
        alpha--;
        this.alpha = alpha;
       // System.out.println(alpha);
    }
}

class AccessDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        //ob.callPrivate();
        int xyz = 10;
        ob.setAlpha(xyz);
        //xyz still 10

    }
}

// todo : question : why not - => 9