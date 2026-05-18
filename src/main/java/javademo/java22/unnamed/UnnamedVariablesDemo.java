package javademo.java22.unnamed;

import java.util.List;
import java.util.Map;

public class UnnamedVariablesDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of("a", 1, "b", 2, "c", 3);

        for (var _ : scores.entrySet()) {
            // iterate for side effect only
        }

        List<String> names = List.of("Alok", "Abhishek");
        System.out.println("name count: " + names.size());

        try {
            int ignored = Integer.parseInt("not-a-number");
        } catch (NumberFormatException _) {
            System.out.println("caught parse error using unnamed catch variable");
        }
    }
}
