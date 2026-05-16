package javademo.collections.priorityqueue;

import java.util.*;

public class PriorityQueueCRUDDemo {
    public static void main(String[] args) {
        /************************************
         *    Creating a PriorityQueue      *
         ************************************/

        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> fromCollection = new PriorityQueue<>(List.of(5, 1, 3));

        System.out.println("fromCollection (heap order, not sorted): " + fromCollection);

        /************************************
         *  Inserting into a PriorityQueue  *
         ************************************/

        minHeap.offer(9);
        minHeap.offer(2);
        minHeap.offer(7);
        minHeap.offer(2);
        minHeap.add(3);
        System.out.println("minHeap after offers: " + minHeap);

        /********************************************
         *   Fetching from a PriorityQueue          *
         ********************************************/

        System.out.println("peek() (min): " + minHeap.peek());
        System.out.println("contains(7): " + minHeap.contains(7));
        System.out.println("size: " + minHeap.size());

        /********************************************
         *   Removing from a PriorityQueue          *
         ********************************************/

        System.out.println("poll() order (ascending):");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        maxHeap.addAll(List.of(9, 2, 7, 3));
        System.out.println("maxHeap poll order (descending):");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

        /********************************************
         *   Checking if the PriorityQueue is empty *
         ********************************************/

        System.out.println("isEmpty(): " + minHeap.isEmpty());
    }
}
