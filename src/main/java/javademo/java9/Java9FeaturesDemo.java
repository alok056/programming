package javademo.java9;

import javademo.java9.interfaces.PrivateInterfaceMethodsDemo;
import javademo.java9.modules.ModuleSystemDemo;

/** Java 9: Module system, JShell, private methods in interfaces. */
public class Java9FeaturesDemo {
    public static void main(String[] args) {
        System.out.println("=== Private interface methods ===");
        PrivateInterfaceMethodsDemo.main(args);

        System.out.println("\n=== Module system ===");
        ModuleSystemDemo.main(args);
    }
}
