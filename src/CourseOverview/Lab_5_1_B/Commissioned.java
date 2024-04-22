package CourseOverview.Lab_5_1_B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission / 100;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order o){
        orders.add(o);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalCommission =  0;
        if(orders == null || orders.isEmpty()) return baseSalary;
        for(Order o: orders){
            boolean sameMonth = o.getOrderDate().getMonthValue() == month;
            boolean sameYear = o.getOrderDate().getYear() == year;
            if(!sameYear || !sameMonth) continue;
            totalCommission += o.getOrderAmount() * commission;
        }
        return baseSalary + totalCommission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Commisioned{" +
                "commission=" + commission +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
