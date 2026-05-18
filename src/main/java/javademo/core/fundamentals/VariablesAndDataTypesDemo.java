package javademo.core.fundamentals;

public class VariablesAndDataTypesDemo {
    public static void main(String[] args) {
        /************************************
         *  Primitive data types            *
         ************************************/

        byte age = 30;
        short year = 2026;
        int count = 100;
        long population = 1_400_000_000L;
        float price = 19.99f;
        double pi = 3.14159;
        char grade = 'A';
        boolean isActive = true;

        System.out.println("int count: " + count);
        System.out.println("double pi: " + pi);
        System.out.println("boolean isActive: " + isActive);

        /************************************
         *  Reference types                 *
         ************************************/

        String name = "Alok";
        Integer boxed = 42;
        Double wrapper = 3.14;

        System.out.println("String: " + name);
        System.out.println("Integer (wrapper): " + boxed);

        /************************************
         *  Constants (final)             *
         ************************************/

        final int MAX_SIZE = 100;
        System.out.println("MAX_SIZE: " + MAX_SIZE);

        /************************************
         *  Type casting                    *
         ************************************/

        int whole = 10;
        double decimal = whole;
        int truncated = (int) 9.99;
        System.out.println("widening: " + decimal);
        System.out.println("narrowing: " + truncated);
    }
}
