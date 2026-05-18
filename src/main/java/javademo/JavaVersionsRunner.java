package javademo;

import javademo.java10.Java10FeaturesDemo;
import javademo.java11.Java11FeaturesDemo;
import javademo.java12.Java12FeaturesDemo;
import javademo.java13.Java13FeaturesDemo;
import javademo.java14.Java14FeaturesDemo;
import javademo.java15.Java15FeaturesDemo;
import javademo.java16.Java16FeaturesDemo;
import javademo.java17.Java17FeaturesDemo;
import javademo.java18.Java18FeaturesDemo;
import javademo.java19.Java19FeaturesDemo;
import javademo.java20.Java20FeaturesDemo;
import javademo.java21.Java21FeaturesDemo;
import javademo.java22.Java22FeaturesDemo;
import javademo.java23.Java23FeaturesDemo;
import javademo.java24.Java24FeaturesDemo;
import javademo.java25.Java25FeaturesDemo;
import javademo.java26.Java26FeaturesDemo;
import javademo.java8.Java8FeaturesDemo;
import javademo.java9.Java9FeaturesDemo;

/**
 * Run demos per Java version: {@code java javademo.JavaVersionsRunner 21}
 * Pass no args to list versions, or pass a version number (8–26).
 */
public class JavaVersionsRunner {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: JavaVersionsRunner <8|9|10|...|26>");
            System.out.println("Examples: JavaVersionsRunner 8   JavaVersionsRunner 21");
            return;
        }

        switch (args[0]) {
            case "8" -> Java8FeaturesDemo.main(new String[0]);
            case "9" -> Java9FeaturesDemo.main(new String[0]);
            case "10" -> Java10FeaturesDemo.main(new String[0]);
            case "11" -> Java11FeaturesDemo.main(new String[0]);
            case "12" -> Java12FeaturesDemo.main(new String[0]);
            case "13" -> Java13FeaturesDemo.main(new String[0]);
            case "14" -> Java14FeaturesDemo.main(new String[0]);
            case "15" -> Java15FeaturesDemo.main(new String[0]);
            case "16" -> Java16FeaturesDemo.main(new String[0]);
            case "17" -> Java17FeaturesDemo.main(new String[0]);
            case "18" -> Java18FeaturesDemo.main(new String[0]);
            case "19" -> Java19FeaturesDemo.main(new String[0]);
            case "20" -> Java20FeaturesDemo.main(new String[0]);
            case "21" -> Java21FeaturesDemo.main(new String[0]);
            case "22" -> Java22FeaturesDemo.main(new String[0]);
            case "23" -> Java23FeaturesDemo.main(new String[0]);
            case "24" -> Java24FeaturesDemo.main(new String[0]);
            case "25" -> Java25FeaturesDemo.main(new String[0]);
            case "26" -> Java26FeaturesDemo.main(new String[0]);
            default -> System.out.println("Unknown version: " + args[0]);
        }
    }
}
