package homework.mode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SolarSystem {
    public static void main(String[] args) {
        List<Planet> planets=new ArrayList<>();
        planets.add(new Planet("Меркурий",57.91,3.30e23,0));
        planets.add(new Planet("Венера",108.21,4.87e24,0));
        planets.add(new Planet("Земля",149.60,5.97e24,1));
        planets.add(new Planet("Марс",227.92,0.64e24,2));
        planets.add(new Planet("Юпитер",778.57,1898.0e24,79));
        planets.add(new Planet("Сатурн",1433.5,568.0e24,83));
        planets.add(new Planet("Уран",2872.5,86.8e24,27));
        planets.add(new Planet("Нептун",4495.1,102.0e24,14));

        //Sort by order of location in the Solar system
        System.out.println("Planets in order of location in the solar system");
        planets.forEach(System.out::println);//forEach method of the Iterable
        System.out.println();

        //sort alphabetically
        planets.sort(Comparator.comparing(Planet::getName));
        System.out.println("Planets in alphabetical order");
        planets.forEach(System.out::println);
        System.out.println();

        //sort by weight
        planets.sort(Comparator.comparing(Planet::getMass));
        System.out.println("Planets by mass");
        planets.forEach(System.out::println);
        System.out.println();

        //sort by number of satellites
        planets.sort(Comparator.comparing(Planet::getNumberOfMoons));
        System.out.println("Planets by number of satellites");
        planets.forEach(System.out::println);

    }
}
