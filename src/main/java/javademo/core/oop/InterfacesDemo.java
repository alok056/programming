package javademo.core.oop;

public class InterfacesDemo {
    public static void main(String[] args) {
        Drawable circle = new CircleShape(3);
        Drawable rectangle = new RectangleShape(4, 5);

        circle.draw();
        rectangle.draw();

        System.out.println("circle area: " + circle.area());
        System.out.println("rectangle area: " + rectangle.area());
    }
}

interface Drawable {
    void draw();

    default void highlight() {
        System.out.println("Highlighting shape...");
    }

    double area();
}

class CircleShape implements Drawable {
    private final double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle, radius=" + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape implements Drawable {
    private final double width;
    private final double height;

    RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        highlight();
        System.out.println("Drawing rectangle " + width + "x" + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
