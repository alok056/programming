package main.java.algorithms.string;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println('A');
        System.out.println('a');
        System.out.println('A' - 'a');
        System.out.println('a' - 'A');

        char[] charArray = "Alok".toCharArray();
        for (char ch: charArray) {
            System.out.println(ch);
        }

        Character characterA = 'A';
        char charA = 'A';

        System.out.println(characterA - charA);
    }
}
