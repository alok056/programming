package javademo.core.oop;

public class PolymorphismDemo {
    public static void main(String[] args) {
        /************************************
         *  Runtime polymorphism            *
         ************************************/

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        printArea(circle);
        printArea(rectangle);

        /************************************
         *  Method overloading              *
         ************************************/

        Calculator calc = new Calculator();
        System.out.println("add ints: " + calc.add(2, 3));
        System.out.println("add doubles: " + calc.add(2.5, 3.1));
    }

    static void printArea(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() + " area: " + shape.area());
    }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
