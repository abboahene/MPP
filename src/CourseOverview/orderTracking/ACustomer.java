package CourseOverview.orderTracking;

import java.util.List;

public abstract class ACustomer implements ICustomer {
    private String name;
    private String address;
    private String phone;
    private double points;
    private double creditRating;

    private List<Order> orders;

    public ACustomer(String name, String address, String phone, double points, double creditRating) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.points = points;
        this.creditRating = creditRating;
    }

    @Override
    public double getCreditRating() {
        return creditRating;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public void setCreditRating(double creditRating) {
        this.creditRating = creditRating;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
