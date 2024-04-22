package CourseOverview.StandardExamsPractice.Exams2_May_2017;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutRecordEntries;

    public List<CheckoutRecordEntry> getCheckoutRecordEntries(){
        return List.copyOf(checkoutRecordEntries);
    }

    public CheckoutRecord(){
        checkoutRecordEntries = new ArrayList<>();
    }

    public void addCheckoutEntry(CheckoutRecordEntry c){
        checkoutRecordEntries.add(c);
    }

}
