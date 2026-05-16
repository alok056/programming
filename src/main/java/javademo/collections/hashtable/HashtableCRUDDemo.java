package javademo.collections.hashtable;

import java.util.*;

public class HashtableCRUDDemo {
    public static void main(String[] args) {
        /************************************
         *       Creating a Hashtable       *
         ************************************/

        Hashtable<String, Integer> table = new Hashtable<>();
        Hashtable<String, Integer> tableWithCapacity = new Hashtable<>(100);
        Hashtable<String, Integer> tableWithCapacityAndLoadFactor = new Hashtable<>(100, 0.75F);

        /************************************
         *  Inserting into a Hashtable      *
         ************************************/

        table.put("one", 1);
        table.put("two", 2);
        table.put("one", 10);
        table.putIfAbsent("three", 3);
        System.out.println("table after inserts: " + table);

        /********************************************
         *   Fetching from a Hashtable              *
         ********************************************/

        System.out.println("get(\"one\"): " + table.get("one"));
        System.out.println("containsKey(\"two\"): " + table.containsKey("two"));
        System.out.println("containsValue(10): " + table.containsValue(10));

        /********************************************
         *   Updating entries in a Hashtable        *
         ********************************************/

        table.replace("two", 20);
        System.out.println("table after replace: " + table);

        /********************************************
         *   Removing from a Hashtable              *
         ********************************************/

        table.remove("three");
        System.out.println("table after remove(\"three\"): " + table);
        table.clear();

        /********************************************
         *   Checking if the Hashtable is empty     *
         ********************************************/

        System.out.println("isEmpty(): " + table.isEmpty());
    }
}
