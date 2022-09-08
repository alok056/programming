package design_patterns.creational.factory;

public abstract class Plan {
    protected double rate;

    public void calculateBill(int units) {
        System.out.println("Electricity bill: " + units * rate);
    }
}
