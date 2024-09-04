package classwork.myarray;

import java.util.ArrayList;
import java.util.List;

public class MyArrayAppl {
    public static void main(String[] args) {
        MyArray myArray= new MyArray(5);
        myArray .setElement(0,1);
        myArray .setElement(1,-3);
        myArray .setElement(2,2);
        myArray .setElement(3,-4);
        myArray .setElement(4,5);

        MyArrayIterator iterator=new MyArrayIterator(myArray);

        changeSing(iterator);

        sgugareElements(iterator);

        removeEvenElements(myArray);
        System.out.println("измененые элементы ");
        for (int i = 0; i < myArray.length(); i++) {
            System.out.println(myArray.getElement(i) + "");

        }
    }
    private static void changeSing(MyArrayIterator iterator){
        List<Integer> newList=new ArrayList<>();
        while (iterator.hasNext()){
            int value =iterator.next();
            newList.add(-value);
        }
        for (int i = 0; i < newList.size(); i++) {
            iterator = new MyArrayIterator(new MyArray(newList.size()));
            iterator.next();
          //  iterator.getArray()[i]= newList.get(i);

        }

    }
    private static void sgugareElements(MyArrayIterator iterator){
        List<Integer> newList=new ArrayList<>();
        while (iterator.hasNext()){
            int value = iterator.next();
            newList.add(value*value);
        }
    }
    private static void removeEvenElements(MyArray myArray){
        List<Integer> newList=new ArrayList<>();
        for (int i = 0; i < myArray.length(); i++) {
            int value =myArray.getElement(i);
            if (value%2!=0){
                newList.add(value);
            }

        }
        MyArray tempArray=new MyArray(newList.size());
        for (int i = 0; i < newList.size(); i++) {
            tempArray.setElement(i,newList.get(i));

        }
        System.arraycopy(tempArray.getArray(),0,myArray.getArray(),0,tempArray.length());
    }


}
