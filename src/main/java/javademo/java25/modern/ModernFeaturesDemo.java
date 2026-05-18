package javademo.java25.modern;

import java.util.List;

/**
 * Java 25: Latest LTS — flexible constructor bodies, module import declarations, and more.
 */
public class ModernFeaturesDemo {
    public static void main(String[] args) {
        System.out.println("JDK: " + Runtime.version());
        System.out.println("Features: flexible constructor bodies, compact source files, scoped values.");

        List<String> names = List.of("Alok", "Abhishek");
        names.forEach(n -> System.out.println("hello, " + n));
    }
}
