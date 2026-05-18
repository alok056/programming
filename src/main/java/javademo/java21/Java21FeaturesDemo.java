package javademo.java21;

import javademo.java21.patternmatching.SwitchPatternDemo;
import javademo.java21.records.RecordPatternsDemo;
import javademo.java21.threads.VirtualThreadsDemo;

/** Java 21: LTS, virtual threads, pattern matching for switch, record patterns. */
public class Java21FeaturesDemo {
    public static void main(String[] args) throws Exception {
        VirtualThreadsDemo.main(args);
        System.out.println();
        SwitchPatternDemo.main(args);
        System.out.println();
        RecordPatternsDemo.main(args);
    }
}
