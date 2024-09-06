package homework;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSortArrayList {
    //метод пузырковой сортировки для ArrayList
    public static int bubbleSort(ArrayList<Integer>arr){
        int n = arr.size();
        int operationCount=0;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                operationCount++;//Считаем каждое сравнение
                if (arr.get(j)>arr.get(j+1)){
                    //меняем местами элементы
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }

            }

        }
        return operationCount;
    }//метод генерации ArrayList
    public static ArrayList<Integer>generateRandomArrayList(int size){
        Random random=new Random();
        ArrayList<Integer>arrayList=new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(1001));//случайное число от 0 до 1000

        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[]sizes={10,100,1000};
        for (int size:sizes){
            ArrayList<Integer>randomArrayList=generateRandomArrayList(size);
            int operationCount=bubbleSort(randomArrayList);
            System.out.printf("количество операций размером %d: %d%n ", size,operationCount);
        }

    }

}
