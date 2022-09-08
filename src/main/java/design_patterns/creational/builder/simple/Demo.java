package design_patterns.creational.builder.simple;

public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone("Android", "QuadCore", 15.0, 4000, 16);

        System.out.println(phone);

        PhoneBuilder phoneBuilder = new PhoneBuilder();

        Phone phoneUsingBuilder = phoneBuilder
                .setOs("iOS")
                .setProcessor("QuadCore")
                .setBattery(2000)
                .setCamera(12)
                .setScreenSize(10.5)
                .build();

        System.out.println(phoneUsingBuilder);
    }
}
