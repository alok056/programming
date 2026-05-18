package javademo.java15.sealed;

public sealed interface Shape permits Circle, Rectangle {}

final class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}
