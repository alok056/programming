package javademo.java8;

import javademo.java8.datetime.DateTimeDemo;
import javademo.java8.lambdas.LambdaDemo;
import javademo.java8.optional.OptionalDemo;
import javademo.java8.streams.StreamDemo;

/**
 * Java 8: Lambdas, Stream API, functional interfaces, Optional, Date/Time API.
 */
public class Java8FeaturesDemo {
    public static void main(String[] args) {
        System.out.println("=== Optional ===");
        OptionalDemo.main(args);

        System.out.println("\n=== Date/Time API ===");
        DateTimeDemo.main(args);

        System.out.println("\n=== Stream API ===");
        StreamDemo.main(args);

        System.out.println("\n=== Lambdas (see also java8/lambdas, java8/interfaces) ===");
        LambdaDemo.main(args);
    }
}
