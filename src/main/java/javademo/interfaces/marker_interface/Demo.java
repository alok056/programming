package javademo.interfaces.marker_interface;

/**
 * A marker interface in Java is an empty interface with no fields or methods. It has three types:
 *
 * Serializable interface
 *
 * Cloneable interface
 *
 * Remote interface
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * Cloneable interface : Cloneable interface is present in java.lang package. There is a method clone() in
         * Object class. A class that implements the Cloneable interface indicates that it is legal for clone() method
         * to make a field-for-field copy of instances of that class. Invoking Object’s clone method on an instance of
         * the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException
         * being thrown. By convention, classes that implement this interface should override Object.clone() method.
         */
        CloneableClass a = new CloneableClass(20, "Test");

        // cloning 'a' and holding new cloned object reference in b

        // down-casting as clone() return type is Object
        CloneableClass b = (CloneableClass) a.clone();

        System.out.println(a);
        System.out.println(b);

        NonCloneableClass t = new NonCloneableClass(2,"A");
        System.out.println(t);

        NonCloneableClass t2, t3;

        try {
            t2 = (NonCloneableClass) t.cloneSuper();
            System.out.println(t2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        try {
            t2 = (NonCloneableClass) t.cloneThis();
            System.out.println(t2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


    }
}
