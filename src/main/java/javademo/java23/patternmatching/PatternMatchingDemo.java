package javademo.java23.patternmatching;

public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object value = "Java 23";
        String result = switch (value) {
            case String s when s.length() > 5 -> "long string: " + s;
            case String s -> "string: " + s;
            case Integer i -> "int: " + i;
            case null -> "null value";
            default -> "other";
        };
        System.out.println(result);

        record Pair(Object left, Object right) {}
        Object data = new Pair("a", 1);
        if (data instanceof Pair(String l, Integer r)) {
            System.out.println("destructured pair: " + l + ", " + r);
        }
    }
}
