package homework;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return (a % 2 == 0 && b % 2 != 0) ? -1 :
                (a % 2 != 0 && b % 2 == 0)?1:
                        0;
    }
}
