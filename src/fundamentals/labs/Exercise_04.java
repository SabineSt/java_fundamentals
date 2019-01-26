package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */


public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        int height = 5;

        double volume = Math.PI*radius*radius*height;
        double surface = 2*Math.PI*radius*(height + radius);

        int roundedvol = (int) (Math.PI*radius*radius*height);
        int roundedsur = (int) (2*Math.PI*radius*(height + radius));

        System.out.println("The volume of the cylinder is " + volume);
        System.out.println("The surface of the cylinder is " + surface);
        System.out.println();
        System.out.println("The rounded up volume of the cylinder is " + roundedvol);
        System.out.println("The rounded up surface of the cylinder is " + roundedsur);

       /* System.out.println();

        Cylinder first = new Cylinder();

        first.radius = 3.14;
        first.height = 5;
        System.out.println(first.volume);
        System.out.println(first.surface);*/
            }
        }

/*// try the OPP style

public class Cylinder {

    public double radius;
    public int height;

    double volume = Math.PI*radius*radius*height;
    double surface = 2*Math.PI*radius*(height + radius);
}
*/







