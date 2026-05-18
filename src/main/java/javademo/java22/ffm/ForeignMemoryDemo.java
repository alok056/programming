package javademo.java22.ffm;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * Java 22+: Foreign Function &amp; Memory API (Panama) for off-heap memory.
 */
public class ForeignMemoryDemo {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(ValueLayout.JAVA_INT, 3);
            segment.setAtIndex(ValueLayout.JAVA_INT, 0, 10);
            segment.setAtIndex(ValueLayout.JAVA_INT, 1, 20);
            segment.setAtIndex(ValueLayout.JAVA_INT, 2, 30);

            int sum = 0;
            for (long i = 0; i < 3; i++) {
                sum += segment.getAtIndex(ValueLayout.JAVA_INT, i);
            }
            System.out.println("off-heap int sum: " + sum);
        }
    }
}
