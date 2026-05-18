package javademo.core.oop;

public class AbstractionDemo {
    public static void main(String[] args) {
        Payment card = new CardPayment("4242");
        Payment upi = new UpiPayment("alok@upi");

        card.pay(500);
        upi.pay(250);

        System.out.println("card receipt: " + card.receipt());
    }
}

abstract class Payment {
    abstract void pay(double amount);

    String receipt() {
        return "Payment processed";
    }
}

class CardPayment extends Payment {
    private final String lastFour;

    CardPayment(String lastFour) {
        this.lastFour = lastFour;
    }

    @Override
    void pay(double amount) {
        System.out.println("Card ****" + lastFour + " paid " + amount);
    }

    @Override
    String receipt() {
        return "Card receipt for ****" + lastFour;
    }
}

class UpiPayment extends Payment {
    private final String vpa;

    UpiPayment(String vpa) {
        this.vpa = vpa;
    }

    @Override
    void pay(double amount) {
        System.out.println("UPI " + vpa + " paid " + amount);
    }
}
