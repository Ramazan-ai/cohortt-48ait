package homework.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Container implements Iterable<Box> {
    private String label;
    private List<Box> boxes;

    public Container(String label) {
        this.label = label;
        this.boxes = new ArrayList<>();
        Random random= new Random();
        int numberOfBoxes = random.nextInt(11)+10;
        IntStream.range(0,numberOfBoxes)
                .forEach(i -> boxes.add(new Box()));
    }
    public String getLabel(){
        return label;
    }
    public int getTotalParcels(){
        return boxes.stream()
                .mapToInt(Box::getNumberOfParcel)
                .sum();
    }
    public Iterator<Box>iterator(){
        return boxes.iterator();
    }
}
