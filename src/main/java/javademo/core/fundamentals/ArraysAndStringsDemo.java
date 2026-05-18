package javademo.core.fundamentals;

import java.util.Arrays;

public class ArraysAndStringsDemo {
    public static void main(String[] args) {
        /************************************
         *  Arrays                            *
         ************************************/

        int[] numbers = {3, 1, 4, 1, 5};
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);

        System.out.println("original: " + Arrays.toString(numbers));
        System.out.println("sorted copy: " + Arrays.toString(copy));
        System.out.println("length: " + numbers.length);
        System.out.println("index 2: " + numbers[2]);

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("matrix[1][0]: " + matrix[1][0]);

        /************************************
         *  Strings                         *
         ************************************/

        String greeting = "Hello";
        String name = "Alok";
        String full = greeting + ", " + name;

        System.out.println("concat: " + full);
        System.out.println("length: " + full.length());
        System.out.println("charAt(0): " + full.charAt(0));
        System.out.println("substring: " + full.substring(7));
        System.out.println("equals: " + full.equals("Hello, Alok"));
        System.out.println("toUpperCase: " + full.toUpperCase());
        System.out.println("split: " + Arrays.toString(full.split(", ")));

        StringBuilder sb = new StringBuilder();
        sb.append("Java").append(" ").append("Core");
        System.out.println("StringBuilder: " + sb);
    }
}
