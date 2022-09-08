package design_patterns.creational.singleton;

/**
 * Static block initialization implementation is similar to eager initialization, except that instance of class is
 * created in the static block that provides option for exception handling.
 */
public class SingletonWithStaticBlockInitialization {
    private static SingletonWithStaticBlockInitialization instance;

    private SingletonWithStaticBlockInitialization() {
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new SingletonWithStaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SingletonWithStaticBlockInitialization getInstance() {
        return instance;
    }
}
