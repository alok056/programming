package javademo.collections.linkedhashmap;

import java.util.*;

public class LinkedHashMapCRUDDemo {
    public static void main(String[] args) {
        /************************************
         *   Creating a LinkedHashMap       *
         ************************************/

        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> mapWithCapacity = new LinkedHashMap<>(100);
        Map<String, Integer> mapWithAccessOrder = new LinkedHashMap<>(16, 0.75F, true);

        /************************************
         *  Inserting into a LinkedHashMap  *
         ************************************/

        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);
        map.put("a", 10);
        System.out.println("map (insertion order): " + map);

        mapWithAccessOrder.put("x", 1);
        mapWithAccessOrder.put("y", 2);
        mapWithAccessOrder.put("z", 3);
        mapWithAccessOrder.get("x");
        mapWithAccessOrder.put("w", 4);
        System.out.println("mapWithAccessOrder (access order): " + mapWithAccessOrder);

        /********************************************
         *   Fetching from a LinkedHashMap          *
         ********************************************/

        System.out.println("get(\"b\"): " + map.get("b"));
        System.out.println("containsKey(\"c\"): " + map.containsKey("c"));

        /********************************************
         *   Updating entries in a LinkedHashMap    *
         ********************************************/

        map.replace("b", 20);
        System.out.println("map after replace: " + map);

        /********************************************
         *   Removing from a LinkedHashMap          *
         ********************************************/

        map.remove("c");
        System.out.println("map after remove(\"c\"): " + map);
        map.clear();

        /********************************************
         *   Checking if the LinkedHashMap is empty *
         ********************************************/

        System.out.println("isEmpty(): " + map.isEmpty());
    }
}
