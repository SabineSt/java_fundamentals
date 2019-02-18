package datatypes_operators.examples;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!

        //todo : ?? nicht (i*i) gemeint? wieso wenn ich bytes multiplizier muss ich das ergebniss in bytes casten?

        System.out.println("i and b: " + i + " " + b);
    }
}