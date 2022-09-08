package javademo.interfaces.marker_interface;
import java.lang.Cloneable;

public class CloneableClass implements Cloneable {
    int i;
    String s;

    public CloneableClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneableInterfaceDemo{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}


