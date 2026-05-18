package javademo.java10.var;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VarDemo {
    public static void main(String[] args) {
        var name = "Alok";
        var count = 42;
        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        var map = Map.of("x", 1, "y", 2);
        List<String> explicit = list;

        System.out.println("name: " + name);
        System.out.println("count: " + count);
        System.out.println("list: " + list);
        System.out.println("map: " + map);
        System.out.println("explicit type still works: " + explicit);
    }
}
