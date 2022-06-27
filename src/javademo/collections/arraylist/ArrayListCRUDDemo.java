package javademo.collections.arraylist;

import java.util.*;

public class ArrayListCRUDDemo {
    public static void main(String[] args) {
        /******************************
         *  Creating an ArrayList     *
         ******************************/

        // 1. Using the no-arg constructor
        // The default constructor does not take any argument and creates a List of size zero
        List rawList = new ArrayList();

        rawList.add("Alok");
        rawList.add(null);
        rawList.add("Abhishek");
        rawList.add(2);
        rawList.add(3);
        rawList.add(true);
        rawList.add(null);


        // Prints: [Alok, null, Abhishek, 2, 3, true, null]
        System.out.println("rawList: " + rawList);

        // 2. Using the constructor that takes initial capacity
        List rawListWithInitialCapacity = new ArrayList(50);
        rawListWithInitialCapacity.add("1");
        rawListWithInitialCapacity.add(2);
        rawListWithInitialCapacity.add(5);
        rawListWithInitialCapacity.add(null);
        rawListWithInitialCapacity.add("Alok");

        System.out.println("rawListWithInitialCapacity: " + rawListWithInitialCapacity);

        // 3. Using existing Collection
        List rawListCopied = new ArrayList<>(rawList);

        // Prints: [Alok, 2, Alok, 3, true, null]
        System.out.println("rawListCopied: " + rawListCopied);

        int[] numbers = {1,4,5,2,34,66,5,4,33,45,50,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        List<Integer> integerList = Arrays.stream(numbers).boxed().toList();

        List rawListCopied2 = new ArrayList(integerList);

        System.out.println("rawListCopied2: " + rawListCopied2);

        /************************************
         *  Inserting into an ArrayList     *
         ************************************/
    }
}
