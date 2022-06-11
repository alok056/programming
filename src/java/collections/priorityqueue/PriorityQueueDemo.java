package java.collections.priorityqueue;


import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> x - y);

        priorityQueue.add(9);
        priorityQueue.add(2);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(7);

        // Remove items from the Priority Queue (DEQUEUE)
        // Prints: 2, 2, 3, 7
        Iterator<Integer> it = priorityQueue.iterator();
        System.out.println("Iterating over queue: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println("Top: " + priorityQueue.peek());
            int n = priorityQueue.remove();
            System.out.println("Removing: " + n);
        }
    }
}
