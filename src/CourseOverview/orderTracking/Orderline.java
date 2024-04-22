package CourseOverview.orderTracking;

import java.time.LocalDate;
import java.util.List;

public class Orderline {

    private double price;
    private int quantity;
    private String status;
    private LocalDate shipDate;
    private double points;

    private Order order;

    private List<IProduct> products;


    public Orderline(double price, int quantity, String status, LocalDate shipDate, double points, Order order) {
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.shipDate = shipDate;
        this.points = points;
        this.order = order;
    }

    double computePrice(){
        double total = 0;
        for(IProduct p: products){
            total += p.getPrice();
        }
        return total;
    }

    double computePoints(){
        double total = 0;
        for(IProduct ip: products){
            Product p = (Product) ip;
            total += p.getCompPoints().getPoints();
        }
        return total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDate shipDate) {
        this.shipDate = shipDate;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<IProduct> getProduct() {
        return products;
    }

    public void setProduct(List<IProduct> products) {
        this.products = products;
    }
}
