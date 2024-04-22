package CourseOverview.orderTracking;

public class PersonalCust extends ACustomer {

    private String creditCardNo;

    public PersonalCust(String name, String address, String phone, double points, double creditRating, String creditCardNo) {
        super(name, address, phone, points, creditRating);
        this.creditCardNo = creditCardNo;
    }


    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
