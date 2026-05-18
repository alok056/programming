package javademo.java21.threads;

import java.time.Duration;
import java.util.concurrent.Executors;

public class VirtualThreadsDemo {
    public static void main(String[] args) throws Exception {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            var future = executor.submit(() -> {
                Thread.sleep(Duration.ofMillis(50));
                return "done on virtual thread";
            });
            System.out.println(future.get());
        }
    }
}
