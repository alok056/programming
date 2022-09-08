package javademo.interfaces.marker_interface;

public class NonCloneableClass {
    private int x;
    private String  s;

    public NonCloneableClass(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public Object cloneThis() throws CloneNotSupportedException {
        return this.clone();
    }

    public Object cloneSuper() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", s='" + s + '\'' +
                '}';
    }
}
