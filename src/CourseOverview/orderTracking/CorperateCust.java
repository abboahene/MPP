package CourseOverview.orderTracking;

public class CorperateCust extends ACustomer {
    private String creditLimit;

    public CorperateCust(String name, String address, String phone, double points, double creditRating, String creditLimit) {
        super(name, address, phone, points, creditRating);
        this.creditLimit = creditLimit;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void generateMonthlyBill(){
        
    }
}
