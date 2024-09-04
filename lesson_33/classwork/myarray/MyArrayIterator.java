package classwork.myarray;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayIterator implements Iterator<Integer> {
    private MyArray myArray;
    private int currentIndex = 0;

    public MyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < myArray.length();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return myArray.getElement(currentIndex++);
    }


}
