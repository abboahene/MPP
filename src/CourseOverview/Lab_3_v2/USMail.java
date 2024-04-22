package CourseOverview.Lab_3_v2;

public class USMail extends Carrier {
    public final static double LESS_THAN_3_POUNDS_COST = 1;
    public final static double PER_POUND_COST = 0.55;
    public final static double WEIGHT_BREAKPOINT = 3;
    public USMail(){
        super("US Mail");
    }

    @Override
    public double getSendingCost(Package p) {
        if(p.getWeight() < WEIGHT_BREAKPOINT) return LESS_THAN_3_POUNDS_COST;
        return p.getWeight() * PER_POUND_COST;
    }
}
