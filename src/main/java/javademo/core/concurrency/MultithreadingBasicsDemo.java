package javademo.core.concurrency;

public class MultithreadingBasicsDemo {
    public static void main(String[] args) throws InterruptedException {
        /************************************
         *  Extending Thread                *
         ************************************/

        Thread t1 = new HelloThread("Thread-A");
        t1.start();
        t1.join();

        /************************************
         *  Implementing Runnable           *
         ************************************/

        Thread t2 = new Thread(new HelloRunnable("Thread-B"));
        t2.start();
        t2.join();

        /************************************
         *  Synchronization                 *
         ************************************/

        Counter counter = new Counter();
        Thread inc1 = new Thread(() -> increment(counter, 1000));
        Thread inc2 = new Thread(() -> increment(counter, 1000));
        inc1.start();
        inc2.start();
        inc1.join();
        inc2.join();
        System.out.println("counter (expected 2000): " + counter.getValue());
    }

    static void increment(Counter counter, int times) {
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}

class HelloThread extends Thread {
    private final String label;

    HelloThread(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        System.out.println(label + " running: " + Thread.currentThread().getName());
    }
}

class HelloRunnable implements Runnable {
    private final String label;

    HelloRunnable(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        System.out.println(label + " running: " + Thread.currentThread().getName());
    }
}

class Counter {
    private int value;

    synchronized void increment() {
        value++;
    }

    synchronized int getValue() {
        return value;
    }
}
