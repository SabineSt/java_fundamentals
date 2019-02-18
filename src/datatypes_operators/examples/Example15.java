package datatypes_operators.examples;

// Demonstate automatic conversion from long to double.
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);

    }
}

//todo: versteh ich nicht : warum nach ersten Zahl das Komma was is eine long zahl überhaupt? wie float f l hinten
// und warum hinten noch : E8