package javademo.interfaces.functional_interfaces;

@FunctionalInterface
// This is not mandatory but if an interface is annotated with @FunctionalInterface annotation and someone tries to
// add another abstract method to the interface, then the compiler will throw an error
public interface FunctionalInterface1 {
    void doSomething();

    default void foo() {
        System.out.println("foo");
    }

    default void foo2() {
        System.out.println("foo");
    }
}
