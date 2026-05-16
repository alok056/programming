package javademo.collections.arraylist;

import java.util.*;

public class ArrayListCRUDDemo {
    public static void main(String[] args) {
        /******************************
         *  Creating an ArrayList     *
         ******************************/

        // 1. Using the no-arg constructor
        // The default constructor does not take any argument and creates a List of size zero

        List test = new ArrayList<>();
        test.add("Alok");
        test.add("Abhishek");

        System.out.println("test: " + test);

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

        List<Integer> list = new ArrayList<>();

        // 1. Adding a single element at the end
        System.out.println("Inserting 23 in the ArrayList: " + list.add(23));
        System.out.println("Inserting 34 in the ArrayList: " + list.add(34));
        System.out.println("Inserting 23 in the ArrayList: " + list.add(23));
        System.out.println("Inserting 40 in the ArrayList: " + list.add(40));
        System.out.println("Inserting null in the ArrayList: " + list.add(null));

        System.out.println("list after add(): " + list);

        // 2. Adding a single element at a specific index
        list.add(1, 99);
        System.out.println("list after add(1, 99): " + list);

        // 3. Adding multiple elements from another collection
        List<Integer> moreNumbers = new ArrayList<>(List.of(10, 20, 30));
        System.out.println("list after addAll(moreNumbers): " + list.addAll(moreNumbers));
        System.out.println("list: " + list);

        // 4. Adding multiple elements at a specific index
        list.addAll(2, List.of(5, 6));
        System.out.println("list after addAll(2, List.of(5, 6)): " + list);

        /********************************************
         *   Fetching an element from an ArrayList  *
         ********************************************/

        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Index of 23: " + list.indexOf(23));
        System.out.println("Last index of 23: " + list.lastIndexOf(23));
        System.out.println("Contains 40: " + list.contains(40));
        System.out.println("Contains 25: " + list.contains(25));
        System.out.println("Contains null: " + list.contains(null));
        System.out.println("Size: " + list.size());

        /********************************************
         *   Updating elements in an ArrayList      *
         ********************************************/

        System.out.println("list before set(): " + list);
        list.set(0, 100);
        list.set(1, 200);
        System.out.println("list after set(0, 100) and set(1, 200): " + list);

        /********************************************
         *   Removing elements from an ArrayList    *
         ********************************************/

        System.out.println("Removed element at index 2: " + list.remove(2));
        System.out.println("list after remove(2): " + list);

        System.out.println("Removed 23: " + list.remove(Integer.valueOf(23)));
        System.out.println("list after remove(23): " + list);

        list.remove(null);
        System.out.println("list after remove(null): " + list);

        list.clear();
        System.out.println("list after clear(): " + list);

        /********************************************
         *   Checking if the ArrayList is empty     *
         ********************************************/

        System.out.println("list.isEmpty(): " + list.isEmpty());
        list.add(1);
        System.out.println("list.isEmpty() after adding 1: " + list.isEmpty());
    }
}
