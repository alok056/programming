package javademo.collections.hashmap;

import java.util.HashMap;

/**
 * Small example: autoboxing and {@code Integer} cache when comparing map values.
 * For full CRUD operations see {@link HashMapCRUDDemo}.
 */
public class Demo {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('c', 2);
        map.put('d', 2);
        map.put('e', 2);

        System.out.println("get('d') == get('c').intValue(): " + (map.get('d') == map.get('c').intValue()));
        System.out.println("get('d') == 2: " + (map.get('d') == 2));
        System.out.println("get('d').equals(2): " + map.get('d').equals(2));
    }
}
