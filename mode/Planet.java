package homework.mode;

public class Planet {
    private String name;
    private double distanceFromSun;
    private double mass;
    private int numberOfMoons;

    public Planet(String name, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceFromSun=").append(distanceFromSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfMoons=").append(numberOfMoons);
        sb.append('}');
        return sb.toString();
    }
}
