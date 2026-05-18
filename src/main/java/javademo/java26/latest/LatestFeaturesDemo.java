package javademo.java26.latest;

/**
 * Java 26: Current feature release (non-LTS). Run on the newest JDK available.
 */
public class LatestFeaturesDemo {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Running: " + version);
        System.out.println("Java 26 is a short-term release; prefer Java 21/25 LTS for production.");
    }
}
