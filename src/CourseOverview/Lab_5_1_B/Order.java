package CourseOverview.Lab_5_1_B;

import java.time.LocalDate;

public class Order {
    private String orderNo;
    private LocalDate orderDate;
    private double orderAmount;
    private Commissioned commissioned;

    public Order(String orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.commissioned = commissioned;
        commissioned.addOrder(this);
    }


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Commissioned getCommisioned() {
        return commissioned;
    }

    public void setCommissioned(Commissioned commisioned) {
        this.commissioned = commisioned;
    }
}
