package CourseOverview.orderTracking;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private String orderNumber;
    private boolean prepaid;
    private double orderPrice;
    private LocalDate orderDate;
    private String status;

    private ICustomer customer;
    private List<Orderline> orderlines;

    public Order(String orderNumber, boolean prepaid, double orderPrice, LocalDate orderDate, String status, ICustomer customer) {
        this.orderNumber = orderNumber;
        this.prepaid = prepaid;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.status = status;
        this.customer = customer;
    }

    public void addOrderline(Orderline orderline){
        this.orderlines.add(orderline);
    }
    double getTotalPrice(){
        double total= 0;
        for(Orderline ol: orderlines){
            total += ol.computePrice();
        }
        return total;
    }
    public boolean getPrepaid(){
        return prepaid;
    }
    public double getCustomerPoints(){
        ACustomer cust = (ACustomer) customer;
        return cust.getPoints();
    }
    public double getOrderPoints(){
        double total= 0;
        for(Orderline ol: orderlines){
            total += ol.computePoints();
        }
        return total;
    }
    public void setCustomerPoints(double points){
        ACustomer cust = (ACustomer) customer;
        cust.setPoints(points);
    }

}
