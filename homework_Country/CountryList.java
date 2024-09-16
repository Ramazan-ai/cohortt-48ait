package homework;

import homework.mode.Planet;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryList {
    public static void main(String[] args) {


        LinkedList<Country> countries = new LinkedList<>();
        countries.add(new Country("Brazil",213.3,"South America"));
        countries.add(new Country("Germany",83.3,"EUROPE"));
        countries.add(new Country("China",1441.0,"Asia"));
        countries.add(new Country("Nigeria",206.1,"Africa"));
        countries.add(new Country("Australia",25.5,"Australia"));
        countries.add(new Country("Canada",37.7,"North America"));
        countries.add(new Country("India",1391.0,"Asia"));
        countries.add(new Country("Mexico",126.0,"North America"));
        countries.add(new Country("France",126.0,"Europa"));
        countries.add(new Country("Argentina",45.5,"South America"));
        countries.add(new Country("Egypt",102.3,"Africa"));

        //sort alphabetically
        countries.sort(Comparator.comparing(Country::getName));
        System.out.println("\nSort in alphabetical order");
        countries.forEach(System.out::println);
        System.out.println();


        countries.sort(Comparator.comparing(Country::getPopulation).reversed());
        System.out.println("\nSort by populatin(desccending)");
        countries.forEach(System.out::println);
        System.out.println();


        countries.sort(Comparator.comparing(Country::getPopulation));
        System.out.println("\nSort by population(ascendihg)");
        countries.forEach(System.out::println);
        System.out.println();

        System.out.println("\nSorting by continent ahd population(descending)");
        countries.stream()
                .sorted(Comparator.comparing(Country::getContinent)
                        .thenComparing(Comparator.comparingDouble(Country::getPopulation).reversed()))
                .forEach(System.out::println);








    }
}
