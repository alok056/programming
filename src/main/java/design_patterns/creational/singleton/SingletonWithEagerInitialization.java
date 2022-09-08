package design_patterns.creational.singleton;

/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading, this is the
 * easiest method to create a singleton class but it has a drawback that instance is created even though client
 * application might not be using it.
 * <p>
 * If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios,
 * Singleton classes are created for resources such as File System, Database connections, etc. We should avoid the
 * instantiation until unless client calls the getInstance method. Also, this method doesn’t provide any options for
 * exception handling.
 */
public class SingletonWithEagerInitialization {
    private static final SingletonWithEagerInitialization instance = new SingletonWithEagerInitialization();

    //private constructor to avoid client applications to use constructor
    private SingletonWithEagerInitialization() {
    }

    public static SingletonWithEagerInitialization getInstance() {
        return instance;
    }
}
