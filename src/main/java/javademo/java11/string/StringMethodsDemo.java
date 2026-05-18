package javademo.java11.string;

public class StringMethodsDemo {
    public static void main(String[] args) {
        System.out.println("'  '.isBlank(): " + "  ".isBlank());
        System.out.println("'abc'.repeat(3): " + "abc".repeat(3));
        System.out.println("'  hi  '.strip(): '" + "  hi  ".strip() + "'");
        System.out.println("lines:\n" + "a\nb\nc".lines().map(l -> "> " + l).reduce("", String::concat));
    }
}
