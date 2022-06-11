package java.collections.arraylist;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        /******************************
         *  Creating an ArrayList     *
         ******************************/

        // 1. Using the no-arg constructor
        // The default constructor does not take any argument and creates a List of size zero
        List rawList = new ArrayList();

        rawList.add("Alok");

        rawList.add("Abhishek");



        rawList.add(2);
        rawList.add(3);
        rawList.add(true);
        rawList.add(null);



        // Prints: [Alok, 2, Alok, 3, true, null]
        System.out.println(rawList);

        // 2. Using the constructor that takes initial capacity
        List rawListWithInitialCapacity = new ArrayList(50);

        // 3. Using existing Collection
        List list3 = new ArrayList<>(rawList);

        // Prints: [Alok, 2, Alok, 3, true, null]
        System.out.println(list3);

        int[] numbers = {1,4,5,2,34,66,5,4,33,45,50,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        List<Integer> integerList = Arrays.stream(numbers).boxed().toList();

        System.out.println(integerList);

        List list4 = new ArrayList(integerList);

        System.out.println(list4);
    }
}
