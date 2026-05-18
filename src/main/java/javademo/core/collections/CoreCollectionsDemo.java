package javademo.core.collections;

import java.util.*;

/**
 * Core collections: ArrayList, HashMap, HashSet.
 * See also detailed CRUD demos in {@code collections/arraylist}, {@code hashmap}, {@code set}.
 */
public class CoreCollectionsDemo {
    public static void main(String[] args) {
        /************************************
         *  ArrayList                       *
         ************************************/

        List<String> list = new ArrayList<>();
        list.add("Alok");
        list.add("Abhishek");
        list.add("Alok");
        list.add(1, "Ramesh");

        System.out.println("ArrayList: " + list);
        System.out.println("get(0): " + list.get(0));
        list.remove("Alok");
        System.out.println("after remove: " + list);

        /************************************
         *  HashMap                         *
         ************************************/

        Map<String, Integer> map = new HashMap<>();
        map.put("India", 91);
        map.put("USA", 1);
        map.put("UK", 44);

        System.out.println("HashMap: " + map);
        System.out.println("get(India): " + map.get("India"));
        System.out.println("containsKey(USA): " + map.containsKey("USA"));

        /************************************
         *  HashSet                         *
         ************************************/

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println("HashSet (no duplicates): " + set);
        System.out.println("contains Java: " + set.contains("Java"));
        set.remove("Python");
        System.out.println("after remove: " + set);
    }
}
