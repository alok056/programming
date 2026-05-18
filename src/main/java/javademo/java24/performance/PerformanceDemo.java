package javademo.java24.performance;

import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * Java 24: Performance, security, and GC improvements (runtime-level).
 */
public class PerformanceDemo {
    public static void main(String[] args) {
        var gcBeans = ManagementFactory.getGarbageCollectorMXBeans();
        gcBeans.forEach(gc -> System.out.println("GC: " + gc.getName()));

        List<Integer> data = List.of(1, 2, 3, 4, 5);
        long sum = data.stream().mapToLong(Integer::longValue).sum();
        System.out.println("stream sum: " + sum);
        System.out.println("Use latest JDK for generational ZGC and JIT improvements.");
    }
}
