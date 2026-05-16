package javademo.collections.hashmap;

import java.util.*;

public class HashMapCRUDDemo {
    public static void main(String[] args) {
        /******************************
         *    Creating a HashMap      *
         ******************************/

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapWithCapacity = new HashMap<>(100);
        Map<String, Integer> mapWithCapacityAndLoadFactor = new HashMap<>(100, 0.75F);
        Map<String, Integer> mapFromAnother = new HashMap<>(Map.of("A", 1, "B", 2));

        System.out.println("mapFromAnother: " + mapFromAnother);

        /************************************
         *  Inserting into a HashMap        *
         ************************************/

        System.out.println("put(\"one\", 1): " + map.put("one", 1));
        System.out.println("put(\"two\", 2): " + map.put("two", 2));
        System.out.println("put(\"one\", 10): " + map.put("one", 10));
        map.putIfAbsent("three", 3);
        map.putIfAbsent("three", 99);
        map.putAll(Map.of("four", 4, "five", 5));
        map.put(null, 0);
        System.out.println("map after inserts: " + map);

        /********************************************
         *   Fetching from a HashMap                *
         ********************************************/

        System.out.println("get(\"one\"): " + map.get("one"));
        System.out.println("getOrDefault(\"missing\", -1): " + map.getOrDefault("missing", -1));
        System.out.println("containsKey(\"two\"): " + map.containsKey("two"));
        System.out.println("containsValue(4): " + map.containsValue(4));
        System.out.println("keySet: " + map.keySet());
        System.out.println("values: " + map.values());
        System.out.println("entrySet size: " + map.entrySet().size());

        /********************************************
         *   Updating entries in a HashMap          *
         ********************************************/

        map.replace("two", 20);
        map.replace("missing", 0);
        System.out.println("map after replace(\"two\", 20): " + map);

        /********************************************
         *   Removing from a HashMap                *
         ********************************************/

        map.remove("five");
        map.remove("four", 4);
        System.out.println("map after removes: " + map);
        map.clear();
        System.out.println("map after clear(): " + map);

        /********************************************
         *   Checking if the HashMap is empty       *
         ********************************************/

        System.out.println("isEmpty(): " + map.isEmpty());
        map.put("x", 1);
        System.out.println("isEmpty() after put: " + map.isEmpty());
    }
}
