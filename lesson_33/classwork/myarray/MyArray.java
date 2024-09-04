package classwork.myarray;

public class MyArray {
    private int[] array;

    public MyArray(int size) {
        array = new int[size];
    }

    public void setElement(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        }
    }

    public int getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Index out of bound");

    }

    public int[] getArray() {
        return array;
    }


    public int length() {
        return array.length;
    }
}
