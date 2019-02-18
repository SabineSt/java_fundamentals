package fundamentals.labs;


public class Cylinder {

    public double radius;
    public int height;

    public double getVolume(){
        double volume = Math.PI * radius * radius * height;

        return volume;
    }

    public double getSurface(){
        double surface = 2 * Math.PI * radius * (height + radius);

        return surface;
    }
}

/*   public double radius;
    public int height;

    double volume = Math.PI * radius * radius * height;
    double surface = 2 * Math.PI * radius * (height + radius);
}*/