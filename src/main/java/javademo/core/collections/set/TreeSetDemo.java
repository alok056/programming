package javademo.core.collections.set;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        /************************************
         *       Creating a TreeSet         *
         ************************************/

        Set<Integer> set = new TreeSet<>();
        Set<Integer> setWithComparator = new TreeSet<>(Comparator.reverseOrder());
        Set<Integer> setFromCollection = new TreeSet<>(List.of(5, 2, 8));

        System.out.println("setFromCollection (sorted): " + setFromCollection);

        /*****************************************
         *  Inserting into a TreeSet             *
         *****************************************/

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("set after inserts (sorted order): " + set);

        setWithComparator.add(3);
        setWithComparator.add(1);
        setWithComparator.add(2);
        System.out.println("setWithComparator (reverse order): " + setWithComparator);

        /********************************************
         *   Fetching from a TreeSet                *
         ********************************************/

        System.out.println("contains(20): " + set.contains(20));
        System.out.println("first (TreeSet): " + ((TreeSet<Integer>) set).first());
        System.out.println("last (TreeSet): " + ((TreeSet<Integer>) set).last());
        System.out.println("ceiling(15): " + ((TreeSet<Integer>) set).ceiling(15));

        /********************************************
         *   Removing from a TreeSet                  *
         ********************************************/

        set.remove(10);
        System.out.println("set after remove(10): " + set);
        ((TreeSet<Integer>) set).pollFirst();
        System.out.println("set after pollFirst(): " + set);
        set.clear();

        /********************************************
         *   Checking if the TreeSet is empty         *
         ********************************************/

        System.out.println("isEmpty(): " + set.isEmpty());
    }
}
