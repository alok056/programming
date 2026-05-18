package javademo.core.fundamentals;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("add: " + add(10, 20));
        System.out.println("greet: " + greet("Alok"));
        printLine('-', 20);
        System.out.println("factorial(5): " + factorial(5));
        MethodsDemo demo = new MethodsDemo();
        demo.instanceGreet();
    }

    static int add(int a, int b) {
        return a + b;
    }

    static String greet(String name) {
        return "Hello, " + name;
    }

    static void printLine(char ch, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    void instanceGreet() {
        System.out.println("Instance method called on " + this.getClass().getSimpleName());
    }
}
