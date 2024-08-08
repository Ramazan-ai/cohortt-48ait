package model;

public class Gear  extends Detail{
    private double radius;

    private int tooth;

    public Gear(long barcode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barcode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    @Override
    public String toString() {
        return "Gear{" +
                "radius=" + radius +
                ", tooth=" + tooth +
                '}';
    }
}
