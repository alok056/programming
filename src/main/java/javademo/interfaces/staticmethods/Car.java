package main.java.javademo.interfaces.staticmethods;

public class Car implements Vehicle {

    // @Override :=> Won't compile as we can't override static methods
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.cleanVehicle();
        Vehicle.cleanVehicle();
    }
}