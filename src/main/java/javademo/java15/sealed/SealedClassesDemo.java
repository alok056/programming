package javademo.java15.sealed;

public class SealedClassesDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("circle area: " + area(circle));
        System.out.println("rectangle area: " + area(rectangle));
    }

    static double area(Shape shape) {
        return switch (shape) {
            case Circle c -> c.area();
            case Rectangle r -> r.area();
        };
    }
}
