package javademo.collections.set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /************************************
         *     Creating a LinkedHashSet     *
         ************************************/

        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> setWithCapacity = new LinkedHashSet<>(100);
        Set<Integer> setWithCapacityAndLoadFactor = new LinkedHashSet<>(100, 0.75F);
        Set<Integer> setFromCollection = new LinkedHashSet<>(List.of(1, 2, 3));

        System.out.println("setFromCollection (insertion order preserved): " + setFromCollection);

        /*****************************************
         *  Inserting into a LinkedHashSet       *
         *****************************************/

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(null);
        System.out.println("set after inserts (maintains insertion order): " + set);

        /********************************************
         *   Fetching from a LinkedHashSet          *
         ********************************************/

        System.out.println("contains(20): " + set.contains(20));
        System.out.println("contains(99): " + set.contains(99));
        System.out.println("contains(null): " + set.contains(null));

        /********************************************
         *   Removing from a LinkedHashSet          *
         ********************************************/

        set.remove(10);
        System.out.println("set after remove(10): " + set);
        set.clear();
        System.out.println("set after clear(): " + set);

        /********************************************
         *   Checking if the LinkedHashSet is empty *
         ********************************************/

        System.out.println("isEmpty(): " + set.isEmpty());
        set.add(1);
        System.out.println("isEmpty() after add(1): " + set.isEmpty());
    }
}
