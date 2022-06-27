package main.java.javademo.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo implements FunctionalInterface1 {
    @Override
    public void doSomething() {
        System.out.println("Inside Main class, doSomething()");
    }

    @Override
    public void foo() {
        FunctionalInterface1.super.foo();
    }

    @Override
    public void foo2() {
        FunctionalInterface1.super.foo2();
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();

        demo.doSomething();;
    }
}
