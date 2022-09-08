package design_patterns.creational.builder.standard;

import design_patterns.creational.builder.standard.Car.CarBuilder;

public class Demo {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder("Engine", "Petrol", 5, "Power");
        Car car = carBuilder
                .setAirBags(4)
                .setCentralLock(true)
                .setMusicSystem("Bose")
                .setSunRoof("Panormic")
                .build();

        System.out.println(car);
    }
}
