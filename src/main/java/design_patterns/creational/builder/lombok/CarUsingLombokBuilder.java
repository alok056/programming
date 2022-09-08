package design_patterns.creational.builder.lombok;

import lombok.Builder;

@Builder
public class CarUsingLombokBuilder {
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
}
