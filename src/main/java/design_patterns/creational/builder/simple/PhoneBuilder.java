package design_patterns.creational.builder.simple;

public class PhoneBuilder {
    private String os;
    private String processor;
    private Double screenSize;
    private int battery;
    private int camera;

    public Phone build() {
       return new Phone(this.os, this.processor, this.screenSize, this.battery, this.camera);
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;

        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;

        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.screenSize = screenSize;

        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;

        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;

        return this;
    }
}
