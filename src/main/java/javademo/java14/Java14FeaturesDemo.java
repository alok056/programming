package javademo.java14;

import javademo.java14.npe.HelpfulNpeDemo;
import javademo.java14.records.PointRecord;

/** Java 14: Records, helpful NullPointerException messages. */
public class Java14FeaturesDemo {
    public static void main(String[] args) {
        PointRecord p = new PointRecord(3, 4);
        System.out.println("record: " + p + ", distance=" + p.distanceFromOrigin());

        System.out.println("\n=== Helpful NPE ===");
        HelpfulNpeDemo.main(args);
    }
}
