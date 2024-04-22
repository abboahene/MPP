package CourseOverview.Lab_3_v2;

public abstract class Carrier implements ICarrier{

    private String name;

    public Carrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
