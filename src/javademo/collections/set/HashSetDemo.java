package javademo.collections.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
//        demoCrudOperations();
//        demoIteration();
        demoOtherOperations();
        while (true) {
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);

            System.out.println("Please enter a string");
            String s = in.nextLine();
            System.out.println("You entered string " + s);

            System.out.println("Please enter a integer");
            int a = in.nextInt();
            System.out.println("You entered integer " + a);

            System.out.println("Please enter a float");
            float b = in.nextFloat();
            System.out.println("You entered float " + b);
        }
    }

    public static void demoOtherOperations() {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(10);

        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);

        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
        System.out.println("setB.removeAll(setA): " + setB.removeAll(setA));
        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
        System.out.println("setB.containsAll(setA): " + setB.containsAll(setA));
        System.out.println("setA.containsAll(setB): " + setA.containsAll(setB));

        setA.add(4);
        setA.add(5);
        setA.add(null);

        setB.add(null);

        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
        System.out.println("setB.containsAll(setA): " + setB.containsAll(setA));
        System.out.println("setA.containsAll(setB): " + setA.containsAll(setB));

        System.out.println("setB.retainAll(setA): " + setB.retainAll(setA));
        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);

        System.out.println("setA.retainAll(setB): " + setA.retainAll(setB));
        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
    }

    public static void demoIteration() {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);

        /************************************
         *       Iterating a HashSet         *
         ************************************/

        // 1. Using for loop
        // Note: Avoid this if the set contains NULL element
        // set.add(null);

        System.out.println("Iterating over HashSet using for loop:");
        for (int i : set) {
            System.out.println(i);
        }

        // 2. Using Iterator
        System.out.println("Iterating over HashSet using Iterator:");
        set.add(null);

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void demoCrudOperations() {
        /************************************
         *       Creating a HashSet         *
         ************************************/

        // 1. Using the no-arg constructor
        Set<Integer> set = new HashSet<>();

        // 2. Using the Constructor that takes initial capacity
        Set<Integer> setWithInitialCapacity = new HashSet<>(100);

        // 3. Using the constructor that takes initial capacity and load factor
        Set<Integer> setWithInitialCapacityAndLoadFactor = new HashSet<>(100, 0.75F);

        // 4. Using the constructor that takes another Set as a parameter#
        Set<Integer> setUsingAnotherSet = new HashSet<>(set);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        Set<String> setUsingHasMapKeys = new HashSet<>(hashMap.keySet());
        Set<Integer> setUsingHasMapValues = new HashSet<>(hashMap.values());


        System.out.println("setUsingHasMapKeys: " + setUsingHasMapKeys);
        System.out.println("setUsingHasMapValues: " + setUsingHasMapValues);

        /*****************************************
         *  Inserting an element into a HashSet  *
         ****************************************/

        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));
        System.out.println("Inserting 34 in the HashSet:  " + set.add(34));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(40));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(null));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(null));

        System.out.println(set);
        System.out.println(setUsingAnotherSet);

        /********************************************
         *   Fetching an element from a HashSet     *
         *******************************************/
        // Unlike ArrayList, there is no get() method in a HashSet because a HashSet is not backed by an array
        System.out.println("Checking whether a particular element is in the HashSet or not");
        System.out.println("23: " + set.contains(23));
        System.out.println("25: " + set.contains(25));
        System.out.println("Null: " + set.contains(null));

        /********************************************
         *   Removing elements from a HashSet       *
         *******************************************/
        System.out.println("HashSet before removing any element: " + set);
        set.remove(23);
        System.out.println("HashSet after removing one element: " + set);
        set.clear();
        System.out.println("HashSet after removing all elements: " + set);

        /********************************************
         *   Checking if the HashSet is empty       *
         *******************************************/

        System.out.println("Set::isEmpty(): " + set.isEmpty());
        set.add(1);
        System.out.println("Set::isEmpty(): " + set.isEmpty());
    }
}
