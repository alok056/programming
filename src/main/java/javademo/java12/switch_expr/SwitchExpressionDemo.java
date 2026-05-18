package javademo.java12.switch_expr;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        int day = 3;
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other";
        };

        String yieldExample = switch (day) {
            case 1, 2 -> "Start of week";
            case 3, 4, 5 -> {
                yield "Midweek";
            }
            default -> "Weekend";
        };

        System.out.println("switch expression: " + name);
        System.out.println("yield branch: " + yieldExample);
    }
}
