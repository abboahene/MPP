package CourseOverview.Lab_5_1_B;

import java.time.LocalDate;

public final class Paycheck {

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    private final LocalDate payPeriod;
    private final Employee employee;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, LocalDate payPeriod, Employee employee) {
        this.grossPay = grossPay;
        this.fica = fica / 100;
        this.state = state / 100;
        this.local = local / 100;
        this.medicare = medicare / 100;
        this.socialSecurity = socialSecurity / 100;
        this.payPeriod = payPeriod;
        this.employee = employee;
        employee.addPayCheck(this);
    }

    public void print() {
        System.out.println( "Paycheck"+"(" + payPeriod.getMonth() + " " + payPeriod.getDayOfMonth() + ")"+
                "\n GrossPay=" + grossPay +
                "\n fica=" + fica +
                "\n state=" + state +
                "\n local=" + local +
                "\n medicare=" + medicare +
                "\n socialSecurity=" + socialSecurity +
                "\n payPeriod=" + payPeriod +
                "\n NetPay=" + getNetPay()
        );
    }

    public double getNetPay(){
        double taxes = grossPay * (fica + state + local + medicare + socialSecurity);
        return grossPay - taxes;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public LocalDate getPayPeriod() {
        return payPeriod;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                ", payPeriod=" + payPeriod +
                ", employee=" + employee +
                '}';
    }
}
