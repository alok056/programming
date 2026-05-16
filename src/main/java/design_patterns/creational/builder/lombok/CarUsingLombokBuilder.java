package design_patterns.creational.builder.lombok;

/**
 * Builder pattern equivalent to Lombok {@code @Builder} (no Lombok dependency required).
 */
public class CarUsingLombokBuilder {
    // Required properties
    private final String engine;
    private final String fuel;
    private final int seats;
    private final String steering;

    // Optional properties
    private final int airBags;
    private final boolean centralLock;
    private final String musicSystem;
    private final String sunRoof;

    private CarUsingLombokBuilder(Builder builder) {
        this.engine = builder.engine;
        this.fuel = builder.fuel;
        this.seats = builder.seats;
        this.steering = builder.steering;
        this.airBags = builder.airBags;
        this.centralLock = builder.centralLock;
        this.musicSystem = builder.musicSystem;
        this.sunRoof = builder.sunRoof;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String engine;
        private String fuel;
        private int seats;
        private String steering;
        private int airBags;
        private boolean centralLock;
        private String musicSystem;
        private String sunRoof;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder fuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder steering(String steering) {
            this.steering = steering;
            return this;
        }

        public Builder airBags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder centralLock(boolean centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder musicSystem(String musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder sunRoof(String sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarUsingLombokBuilder build() {
            return new CarUsingLombokBuilder(this);
        }
    }
}
