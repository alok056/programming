package javademo.java21.records;

record Point(int x, int y) {}

public class RecordPatternsDemo {
    public static void main(String[] args) {
        Object shape = new Point(3, 4);
        if (shape instanceof Point(int x, int y)) {
            System.out.println("record pattern: x=" + x + ", y=" + y);
        }
    }
}
