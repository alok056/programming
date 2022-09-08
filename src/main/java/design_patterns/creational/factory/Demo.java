package design_patterns.creational.factory;

public class Demo {
    public static void main(String args[]) {
        PlanFactory planFactory = new PlanFactory();

        String planName = "DOMESTICPLAN"; // DOMESTICPLAN, COMMERCIALPLAN, INSTITUTIONALPLAN
        int units = 100;

        Plan p = planFactory.getPlan(planName);

        p.calculateBill(units);
    }
}
