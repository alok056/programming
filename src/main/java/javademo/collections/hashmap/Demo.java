package main.java.javademo.collections.hashmap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
//        map.put('b', new Integer(2));
//        map.put('c', new Integer(2));
        map.put('d', 2);
        map.put('e', 2);

//        System.out.println(map.get('b') == map.get('c'));
//        System.out.println(map.get('d') == map.get('e'));
        System.out.println(map.get('d') == map.get('c').intValue());
    }
}
