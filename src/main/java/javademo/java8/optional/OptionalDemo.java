package javademo.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> present = Optional.of("Alok");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        present.ifPresent(v -> System.out.println("ifPresent: " + v));
        System.out.println("orElse: " + empty.orElse("default"));
        System.out.println("orElseGet: " + nullable.orElseGet(() -> "generated"));
        System.out.println("map: " + present.map(String::toUpperCase).orElse("N/A"));
    }
}
