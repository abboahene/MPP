package CourseOverview.Lab_3_v2;

public class UPS extends Carrier {

    public final static double PER_POUND_COST = 0.45;
    public UPS(){
        super("UPS");
    }

    @Override
    public double getSendingCost(Package p) {
        return PER_POUND_COST * p.getWeight();
    }
}
