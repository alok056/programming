package javademo.core.collections.queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        /************************************
         *         Creating a Queue         *
         ************************************/

        Queue<Integer> linkedListQueue = new LinkedList<>();
        Queue<Integer> arrayDequeQueue = new ArrayDeque<>();

        /************************************
         *  Inserting into a Queue          *
         ************************************/

        linkedListQueue.offer(10);
        linkedListQueue.offer(20);
        linkedListQueue.offer(30);
        System.out.println("linkedListQueue: " + linkedListQueue);

        arrayDequeQueue.addAll(List.of(1, 2, 3));
        System.out.println("arrayDequeQueue: " + arrayDequeQueue);

        /********************************************
         *   Fetching from a Queue                  *
         ********************************************/

        System.out.println("peek (LinkedList): " + linkedListQueue.peek());
        System.out.println("element (ArrayDeque): " + arrayDequeQueue.element());

        /********************************************
         *   Removing from a Queue (FIFO)           *
         ********************************************/

        System.out.println("poll order (LinkedList):");
        while (!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.poll());
        }

        System.out.println("remove order (ArrayDeque):");
        while (!arrayDequeQueue.isEmpty()) {
            System.out.println(arrayDequeQueue.remove());
        }

        /********************************************
         *   Checking if the Queue is empty         *
         ********************************************/

        System.out.println("isEmpty(): " + linkedListQueue.isEmpty());
    }
}
