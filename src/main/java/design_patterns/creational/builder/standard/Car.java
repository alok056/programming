package design_patterns.creational.builder.standard;

/**
 * Let’s see how we can implement builder design pattern in java.
 *
 * 1. Create a static nested class and then copy all the arguments from the outer class to the Builder class.
 * We should follow the naming convention and if the class name is Car then builder class should be named as
 * CarBuilder.
 *
 * 2. Java Builder class should have a public constructor with all the required attributes as parameters.
 *
 * 3. Java Builder class should have methods to set the optional parameters and it should return the same Builder
 * object after setting the optional attribute.
 *
 * 4. The final step is to provide a build() method in the builder class that will return the Object needed by client
 * program. For this we need to have a private constructor in the Class with Builder class as argument.
 */
public class Car {
    // Required properties
    private final String engine;
    private final String fuel;
    private final int seats;
    private final String steering;

    // Optional properties
    private int airBags;
    private boolean centralLock;
    private String musicSystem;
    private String sunRoof;

    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.fuel = carBuilder.fuel;
        this.seats = carBuilder.seats;
        this.steering = carBuilder.steering;

        this.airBags = carBuilder.airBags;
        this.centralLock = carBuilder.centralLock;
        this.musicSystem = carBuilder.musicSystem;
        this.sunRoof = carBuilder.sunRoof;
    }

    // Getters
    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSeats() {
        return seats;
    }

    public String getSteering() {
        return steering;
    }

    public int getAirBags() {
        return airBags;
    }

    public boolean isCentralLock() {
        return centralLock;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSunRoof() {
        return sunRoof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", seats=" + seats +
                ", steering='" + steering + '\'' +
                ", airBags=" + airBags +
                ", centralLock=" + centralLock +
                ", musicSystem='" + musicSystem + '\'' +
                ", sunRoof='" + sunRoof + '\'' +
                '}';
    }

    // Builder Class
    public static class CarBuilder {
        // Required properties
        private String engine;
        private String fuel;
        private int seats;
        private String steering;

        // Optional properties
        private int airBags;
        private boolean centralLock;
        private String musicSystem;
        private String sunRoof;

        public CarBuilder(String engine, String fuel, int seats, String steering) {
            this.engine = engine;
            this.fuel = fuel;
            this.seats = seats;
            this.steering = steering;
        }

        public CarBuilder setAirBags(int airBags) {
            this.airBags = airBags;

            return this;
        }

        public CarBuilder setCentralLock(boolean centralLock) {
            this.centralLock = centralLock;

            return this;
        }

        public CarBuilder setMusicSystem(String musicSystem) {
            this.musicSystem = musicSystem;

            return this;
        }

        public CarBuilder setSunRoof(String sunRoof) {
            this.sunRoof = sunRoof;

            return this;
        }

        public Car build() {
            if (this.engine == null || this.steering == null || this.seats == 0 || this.fuel == null) {
                throw new RuntimeException("All required properties are not present.");
            }

            return new Car(this);
        }
    }
}
