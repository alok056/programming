package design_patterns.creational.singleton;

public class SingletonWithThreadSafe {
    private static SingletonWithThreadSafe instance;

    private SingletonWithThreadSafe() {
    }

    private static synchronized SingletonWithThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonWithThreadSafe();
        }

        return instance;
    }
}
