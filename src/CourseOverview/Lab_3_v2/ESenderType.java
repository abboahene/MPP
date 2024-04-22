package CourseOverview.Lab_3_v2;

public enum ESenderType {
        STUDENT(0.1),
        SENIOR_CITIZEN(0.15),
        OTHER(0);

    private final double rate;
    ESenderType(double rate){
        this.rate = rate;
    }
    public double value(){
        return rate;
    }
}
