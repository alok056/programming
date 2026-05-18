package javademo.java14.npe;

public class HelpfulNpeDemo {
    public static void main(String[] args) {
        Person person = new Person("Alok", new Address(null));
        try {
            String city = person.address().city().toUpperCase();
            System.out.println(city);
        } catch (NullPointerException e) {
            // Java 14+: message shows which method returned null
            System.out.println("Helpful NPE message: " + e.getMessage());
        }
    }

    record Person(String name, Address address) {}

    record Address(String city) {}
}
