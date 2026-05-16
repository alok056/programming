package javademo.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(4);
        list.add(30);
        list.add(67);
        list.add(9);

        System.out.println("Iterating LinkedList using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Iterating LinkedList using enhanced for loop:");
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Iterating LinkedList using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating LinkedList using ListIterator (forward):");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Iterating LinkedList using ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
