package javademo.java18;

import javademo.java18.charset.Utf8DefaultDemo;

/** Java 18: Simple web server, UTF-8 default. */
public class Java18FeaturesDemo {
    public static void main(String[] args) throws Exception {
        Utf8DefaultDemo.main(args);
        System.out.println("\n=== Simple web server (starts HTTP server; Ctrl+C to exit) ===");
        System.out.println("Run: javademo.java18.server.SimpleWebServerDemo");
    }
}
