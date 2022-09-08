package javademo.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(30);
        list.add(67);
        list.add(9);

        // 1. Using simple for loop
        System.out.println("Iterating ArrayList using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Using enhanced for loop
        System.out.println("Iterating ArrayList using enhanced for loop: ");
        for (int i: list) {
            System.out.println(i);
        }

        // 3. Using Iterator
        System.out.println("Iterating ArrayList using Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }

        System.out.println("Iterating ArrayList using ListIterator: ");
        Iterator<Integer> iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            Integer item = iterator2.next();
            System.out.println(item);
        }
    }
}
