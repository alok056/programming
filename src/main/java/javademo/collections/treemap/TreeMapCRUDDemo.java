package javademo.collections.treemap;

import java.util.*;

public class TreeMapCRUDDemo {
    public static void main(String[] args) {
        /************************************
         *       Creating a TreeMap         *
         ************************************/

        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> mapFromMap = new TreeMap<>(Map.of("c", 3, "a", 1, "b", 2));

        System.out.println("mapFromMap (sorted by key): " + mapFromMap);

        /************************************
         *  Inserting into a TreeMap      *
         ************************************/

        map.put("cherry", 3);
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("apple", 10);
        System.out.println("map after inserts: " + map);

        /********************************************
         *   Fetching from a TreeMap                *
         ********************************************/

        System.out.println("get(\"banana\"): " + map.get("banana"));
        System.out.println("firstKey: " + ((TreeMap<String, Integer>) map).firstKey());
        System.out.println("lastKey: " + ((TreeMap<String, Integer>) map).lastKey());
        System.out.println("ceilingEntry(\"ban\"): " + ((TreeMap<String, Integer>) map).ceilingEntry("ban"));

        /********************************************
         *   Updating entries in a TreeMap          *
         ********************************************/

        map.replace("banana", 20);
        System.out.println("map after replace: " + map);

        /********************************************
         *   Removing from a TreeMap                *
         ********************************************/

        map.remove("cherry");
        ((TreeMap<String, Integer>) map).pollFirstEntry();
        System.out.println("map after removes: " + map);
        map.clear();

        /********************************************
         *   Checking if the TreeMap is empty       *
         ********************************************/

        System.out.println("isEmpty(): " + map.isEmpty());
    }
}
