package javademo.java22;

import javademo.java22.ffm.ForeignMemoryDemo;
import javademo.java22.unnamed.UnnamedVariablesDemo;

/** Java 22: Foreign Function &amp; Memory API, unnamed variables. */
public class Java22FeaturesDemo {
    public static void main(String[] args) {
        ForeignMemoryDemo.main(args);
        System.out.println();
        UnnamedVariablesDemo.main(args);
    }
}
