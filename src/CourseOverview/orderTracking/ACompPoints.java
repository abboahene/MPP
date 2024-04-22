package CourseOverview.orderTracking;

public abstract class ACompPoints implements ICompPoints{

    private double points;

    public ACompPoints(double points) {
        this.points = points;
    }

    @Override
    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
