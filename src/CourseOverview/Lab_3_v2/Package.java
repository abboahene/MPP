package CourseOverview.Lab_3_v2;

public class Package {

    private String description;
    private double weight;
    private String zone;
    private ESenderType sender;

    public Package(String description, double weight, String zone) {
        this.description = description;
        this.weight = weight;
        this.zone = zone;
    }
    public Package(String description, double weight, String zone, ESenderType sender) {
        this.description = description;
        this.weight = weight;
        this.zone = zone;
        this.sender = sender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public ESenderType getSender() {
        return sender;
    }

    public void setSender(ESenderType sender) {
        this.sender = sender;
    }
}
