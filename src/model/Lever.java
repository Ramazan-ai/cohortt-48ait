package model;

public class Lever extends Detail{
    private double power;

    public Lever(long barcode, double size, String material, String vendor, double weight, double power) {
        super(barcode, size, material, vendor, weight);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Lever{" +
                "power=" + power +
                '}';
    }
}
