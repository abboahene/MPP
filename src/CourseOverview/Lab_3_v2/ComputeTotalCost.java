package CourseOverview.Lab_3_v2;

public class ComputeTotalCost {
    public static double calcTotalCost(ICarrier c, Package p) {
        double grossCost = c.getSendingCost(p);
        double discount = grossCost * p.getSender().value();
        return  grossCost - discount;
    }
}
