package javademo.java21.patternmatching;

sealed interface Expr permits Constant, Add {}

record Constant(int value) implements Expr {}

record Add(Expr left, Expr right) implements Expr {}

public class SwitchPatternDemo {
    public static void main(String[] args) {
        Expr expr = new Add(new Constant(2), new Constant(3));
        System.out.println("eval: " + eval(expr));
    }

    static int eval(Expr expr) {
        return switch (expr) {
            case Constant c -> c.value();
            case Add a -> eval(a.left()) + eval(a.right());
        };
    }
}
