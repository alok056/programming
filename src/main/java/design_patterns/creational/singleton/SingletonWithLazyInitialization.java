package design_patterns.creational.singleton;

public class SingletonWithLazyInitialization {
    private static SingletonWithLazyInitialization instance;

    private SingletonWithLazyInitialization() {
    }

    public static SingletonWithLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonWithLazyInitialization();
        }
        return instance;
    }
}
