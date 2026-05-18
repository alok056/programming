package javademo.core.collections.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeCRUDDemo {
    public static void main(String[] args) {
        /************************************
         *      Creating an ArrayDeque      *
         ************************************/

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> dequeWithCapacity = new ArrayDeque<>(50);
        Deque<Integer> dequeFromCollection = new ArrayDeque<>(java.util.List.of(1, 2, 3));

        System.out.println("dequeFromCollection: " + dequeFromCollection);

        /************************************
         *  Inserting into an ArrayDeque    *
         ************************************/

        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerFirst(5);
        deque.addFirst(1);
        deque.addLast(30);
        System.out.println("deque after inserts: " + deque);

        /********************************************
         *   Fetching from an ArrayDeque            *
         ********************************************/

        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());
        System.out.println("contains(20): " + deque.contains(20));
        System.out.println("size: " + deque.size());

        /********************************************
         *   Removing from an ArrayDeque            *
         ********************************************/

        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        deque.remove(20);
        System.out.println("deque after removes: " + deque);
        deque.clear();

        /********************************************
         *   Checking if the ArrayDeque is empty    *
         ********************************************/

        System.out.println("isEmpty(): " + deque.isEmpty());

        System.out.println("Iterating ArrayDeque:");
        deque.addAll(java.util.List.of(3, 1, 4));
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
