package javademo.java19.threads;

import java.util.concurrent.Executors;

public class VirtualThreadsPreviewDemo {
    public static void main(String[] args) throws Exception {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                int taskId = i;
                executor.submit(() -> System.out.println("virtual task " + taskId +
                        " on " + Thread.currentThread()));
            }
        }

        Thread.startVirtualThread(() ->
                System.out.println("startVirtualThread: " + Thread.currentThread().isVirtual()));
    }
}
