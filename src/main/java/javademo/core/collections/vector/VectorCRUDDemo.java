package javademo.core.collections.vector;

import java.util.*;

public class VectorCRUDDemo {
    public static void main(String[] args) {
        /******************************
         *    Creating a Vector       *
         ******************************/

        Vector<Integer> vector = new Vector<>();
        Vector<Integer> vectorWithCapacity = new Vector<>(50);
        Vector<Integer> vectorWithCapacityAndIncrement = new Vector<>(50, 10);
        Vector<Integer> vectorFromCollection = new Vector<>(List.of(1, 2, 3));

        System.out.println("vectorFromCollection: " + vectorFromCollection);

        /************************************
         *  Inserting into a Vector         *
         ************************************/

        vector.add(23);
        vector.add(34);
        vector.add(1, 99);
        vector.addElement(40);
        vector.addAll(List.of(5, 6));
        System.out.println("vector after inserts: " + vector);
        System.out.println("capacity: " + vector.capacity());

        /********************************************
         *   Fetching from a Vector                 *
         ********************************************/

        System.out.println("get(0): " + vector.get(0));
        System.out.println("firstElement(): " + vector.firstElement());
        System.out.println("lastElement(): " + vector.lastElement());
        System.out.println("indexOf(34): " + vector.indexOf(34));

        /********************************************
         *   Updating elements in a Vector          *
         ********************************************/

        vector.set(0, 100);
        System.out.println("vector after set(0, 100): " + vector);

        /********************************************
         *   Removing from a Vector                 *
         ********************************************/

        vector.remove(2);
        vector.removeElement(Integer.valueOf(34));
        System.out.println("vector after removes: " + vector);
        vector.clear();

        /********************************************
         *   Checking if the Vector is empty        *
         ********************************************/

        System.out.println("isEmpty(): " + vector.isEmpty());
    }
}
