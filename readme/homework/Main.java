package homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int []array= new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(100)+1;


        }
        System.out.println(Arrays.toString(array));
        Integer[] integerArray =Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray,new OddEvenComparator());
        System.out.println(Arrays.toString(integerArray));
    }
}
