package javademo.java20.preview;

import java.util.concurrent.CompletableFuture;

/**
 * Java 20 shipped structured concurrency as a preview; see Java 21+ for virtual threads
 * and later JDKs for finalized StructuredTaskScope APIs.
 */
public class StructuredConcurrencyDemo {
    public static void main(String[] args) {
        CompletableFuture<String> first = CompletableFuture.supplyAsync(() -> "task-A");
        CompletableFuture<String> second = CompletableFuture.supplyAsync(() -> "task-B");

        CompletableFuture.allOf(first, second).join();
        System.out.println(first.join() + ", " + second.join());
    }
}
