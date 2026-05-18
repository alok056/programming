package javademo.core;

import javademo.core.collections.CoreCollectionsDemo;
import javademo.core.concurrency.MultithreadingBasicsDemo;
import javademo.core.exceptions.ExceptionHandlingDemo;
import javademo.core.fundamentals.*;
import javademo.core.io.FileHandlingDemo;
import javademo.core.oop.*;

/**
 * Run core Java learning sections.
 * Usage: {@code java javademo.core.CoreJavaRunner [section]}
 * Sections: all | variables | control | arrays | methods | classes | constructors |
 * inheritance | polymorphism | abstraction | interfaces | exceptions | collections |
 * files | threads
 */
public class CoreJavaRunner {
    public static void main(String[] args) throws Exception {
        String section = args.length == 0 ? "all" : args[0].toLowerCase();

        switch (section) {
            case "all" -> runAll();
            case "variables" -> VariablesAndDataTypesDemo.main(args);
            case "control" -> ControlFlowDemo.main(args);
            case "arrays" -> ArraysAndStringsDemo.main(args);
            case "methods" -> MethodsDemo.main(args);
            case "classes" -> ClassesAndObjectsDemo.main(args);
            case "constructors" -> ConstructorsDemo.main(args);
            case "inheritance" -> InheritanceDemo.main(args);
            case "polymorphism" -> PolymorphismDemo.main(args);
            case "abstraction" -> AbstractionDemo.main(args);
            case "interfaces" -> InterfacesDemo.main(args);
            case "exceptions" -> ExceptionHandlingDemo.main(args);
            case "collections" -> CoreCollectionsDemo.main(args);
            case "files" -> FileHandlingDemo.main(args);
            case "threads" -> MultithreadingBasicsDemo.main(args);
            default -> printUsage();
        }
    }

    private static void runAll() throws Exception {
        String[] noArgs = new String[0];
        runSection("Variables & data types", () -> VariablesAndDataTypesDemo.main(noArgs));
        runSection("if-else & loops", () -> ControlFlowDemo.main(noArgs));
        runSection("Arrays & Strings", () -> ArraysAndStringsDemo.main(noArgs));
        runSection("Methods", () -> MethodsDemo.main(noArgs));
        runSection("Classes & Objects", () -> ClassesAndObjectsDemo.main(noArgs));
        runSection("Constructors", () -> ConstructorsDemo.main(noArgs));
        runSection("Inheritance", () -> InheritanceDemo.main(noArgs));
        runSection("Polymorphism", () -> PolymorphismDemo.main(noArgs));
        runSection("Abstraction", () -> AbstractionDemo.main(noArgs));
        runSection("Interfaces", () -> InterfacesDemo.main(noArgs));
        runSection("Exception handling", () -> ExceptionHandlingDemo.main(noArgs));
        runSection("Collections", () -> CoreCollectionsDemo.main(noArgs));
        runSection("File handling", () -> FileHandlingDemo.main(noArgs));
        runSection("Multithreading", () -> MultithreadingBasicsDemo.main(noArgs));
    }

    @FunctionalInterface
    private interface SectionRunner {
        void run() throws Exception;
    }

    private static void runSection(String title, SectionRunner runnable) throws Exception {
        System.out.println("\n========== " + title + " ==========");
        runnable.run();
    }

    private static void printUsage() {
        System.out.println("Usage: CoreJavaRunner [section]");
        System.out.println("Sections: all, variables, control, arrays, methods, classes,");
        System.out.println("  constructors, inheritance, polymorphism, abstraction, interfaces,");
        System.out.println("  exceptions, collections, files, threads");
    }
}
