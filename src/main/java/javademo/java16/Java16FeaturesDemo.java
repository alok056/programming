package javademo.java16;

import javademo.java16.patternmatching.InstanceofPatternDemo;
import javademo.java16.records.UserRecord;

/** Java 16: Records final, pattern matching for {@code instanceof}. */
public class Java16FeaturesDemo {
    public static void main(String[] args) {
        UserRecord user = new UserRecord("Alok", 30);
        System.out.println("record: " + user);

        System.out.println("\n=== instanceof pattern matching ===");
        InstanceofPatternDemo.main(args);
    }
}
