package design_patterns.creational.builder.simple;

public class Phone {
    private String os;
    private String processor;
    private Double screenSize;
    private int battery;
    private int camera;

    public Phone(String os, String processor, Double screenSize, int battery, int camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
