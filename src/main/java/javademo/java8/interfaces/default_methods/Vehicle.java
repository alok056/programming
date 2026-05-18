package javademo.java8.interfaces.default_methods;

public interface Vehicle {

    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}
