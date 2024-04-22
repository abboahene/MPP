package CourseOverview.StandardExamsPractice.Exams2_May_2017;

public class LibraryMember {

    private String memberId;
    private String firstName;
    private String LastName;
    private String phone;

    private CheckoutRecord checkoutRecord;

    public LibraryMember(String memberId, String firstName, String lastName, String phone) {
        this.memberId = memberId;
        this.firstName = firstName;
        LastName = lastName;
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhone() {
        return phone;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }
}
