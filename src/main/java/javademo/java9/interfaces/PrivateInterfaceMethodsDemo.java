package javademo.java9.interfaces;

interface Greeter {
    default void greet(String name) {
        log("greeting");
        System.out.println("Hello, " + name);
    }

    private void log(String action) {
        System.out.println("[log] " + action);
    }
}

public class PrivateInterfaceMethodsDemo implements Greeter {
    public static void main(String[] args) {
        new PrivateInterfaceMethodsDemo().greet("Alok");
    }
}
