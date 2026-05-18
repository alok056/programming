package javademo.java16.patternmatching;

public class InstanceofPatternDemo {
    public static void main(String[] args) {
        Object value = "hello";

        if (value instanceof String s) {
            System.out.println("length: " + s.length());
        }

        Object num = 42;
        if (num instanceof Integer i && i > 0) {
            System.out.println("positive int: " + i);
        }
    }
}
