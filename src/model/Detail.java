package model;

public class Detail {
    private  long barcode;
    private double size;
    private String material;
    private String vendor;
    private double weight;

    public Detail(long barcode, double size, String material, String vendor, double weight) {
        this.barcode = barcode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "barcode=" + barcode +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", vendor='" + vendor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
