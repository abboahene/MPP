package CourseOverview.Lab_5_1_B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Employee {
    private String empId;

    private List<Paycheck> paychecks;

    public Employee(String empId) {
        this.empId = empId;
        this.paychecks = new ArrayList<>();
    }

    public abstract double calcGrossPay(int month, int year);

    public void addPayCheck(Paycheck p){
        paychecks.add(p);
    }

    public List<Paycheck> getPaychecks(){
        return paychecks;
    }

    public void print() {
        System.out.println("------------------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("------------------------------");
        if(paychecks == null || paychecks.isEmpty()) {
            System.out.println("No paychecks available");
            System.out.println();
            return;
        }
        for (Paycheck p: paychecks){
            System.out.print("*");
            p.print();
            System.out.println("...............................");
        }
        System.out.println();
    }

    public Paycheck calcCompensation(int month, int year){
        LocalDate date = LocalDate.of(year, month, 1);
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay, 23, 5, 1, 3, 7.5, date, this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", paychecks=" + paychecks +
                '}';
    }
}
