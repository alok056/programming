package javademo.java11;

import javademo.java11.http.HttpClientDemo;
import javademo.java11.string.StringMethodsDemo;

/** Java 11: New String methods, HTTP Client API, LTS. */
public class Java11FeaturesDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("=== String methods ===");
        StringMethodsDemo.main(args);

        System.out.println("\n=== HTTP Client ===");
        HttpClientDemo.main(args);
    }
}
