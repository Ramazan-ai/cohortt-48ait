package homework;

public class Country {
    private String name;
    private double population;
    private String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append(", continent='").append(continent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
