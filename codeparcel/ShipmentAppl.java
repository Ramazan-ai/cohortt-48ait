package homework.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShipmentAppl {
    public static void main(String[] args) {
        List<Container> containers = new ArrayList<>();
        Random random = new Random();
        int numberOfContainers = random.nextInt(11) + 10;


        IntStream.range(0, numberOfContainers)
                .forEach(i -> containers.add(new Container("Container " + (i+1))));

        int totalParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .sum();

        double totalWeight = totalParcels * 2.0;
        int maxParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .max()
                .orElse(0);

        List<String> maxParcelContainers = containers.stream()
                .filter(container -> container.getTotalParcels() == maxParcels)
                .map(Container::getLabel)
                .collect(Collectors.toList());

        System.out.println("Total number of pacels: " + totalParcels);
        System.out.println("Total weight of parcels: " + totalWeight);
        System.out.println("Containers with the maximum number of parcel (" + maxParcels + "):" + maxParcelContainers);
    }
}
