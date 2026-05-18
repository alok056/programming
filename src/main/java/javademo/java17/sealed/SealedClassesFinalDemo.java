package javademo.java17.sealed;

public class SealedClassesFinalDemo {
    public static void main(String[] args) {
        describe(new CardPayment("4242"));
        describe(new UpiPayment("alok@upi"));
    }

    static void describe(Payment payment) {
        String label = switch (payment) {
            case CardPayment c -> "Card ending " + c.lastFour();
            case UpiPayment u -> "UPI " + u.vpa();
        };
        System.out.println(label);
    }
}
