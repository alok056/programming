package javademo.collections.linkedlist;

import java.util.*;

public class LinkedListCRUDDemo {
    public static void main(String[] args) {
        /******************************
         *  Creating a LinkedList     *
         ******************************/

        // 1. Using the no-arg constructor
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Using the constructor that takes another Collection
        List<Integer> source = List.of(1, 2, 3);
        LinkedList<Integer> listFromCollection = new LinkedList<>(source);

        System.out.println("listFromCollection: " + listFromCollection);

        /************************************
         *  Inserting into a LinkedList     *
         ************************************/

        System.out.println("add(23): " + list.add(23));
        System.out.println("add(34): " + list.add(34));
        list.addFirst(10);
        list.addLast(40);
        list.add(1, 99);
        list.addAll(List.of(5, 6));
        System.out.println("list after inserts: " + list);

        /********************************************
         *   Fetching an element from a LinkedList  *
         ********************************************/

        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("get(2): " + list.get(2));
        System.out.println("indexOf(23): " + list.indexOf(23));
        System.out.println("contains(40): " + list.contains(40));

        /********************************************
         *   Updating elements in a LinkedList      *
         ********************************************/

        list.set(0, 100);
        System.out.println("list after set(0, 100): " + list);

        /********************************************
         *   Removing elements from a LinkedList    *
         ********************************************/

        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println("removeLast(): " + list.removeLast());
        list.remove(Integer.valueOf(23));
        System.out.println("list after removes: " + list);
        list.clear();
        System.out.println("list after clear(): " + list);

        /********************************************
         *   Checking if the LinkedList is empty    *
         ********************************************/

        System.out.println("isEmpty(): " + list.isEmpty());
        list.add(1);
        System.out.println("isEmpty() after add(1): " + list.isEmpty());
    }
}
