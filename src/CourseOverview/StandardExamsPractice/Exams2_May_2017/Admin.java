package CourseOverview.StandardExamsPractice.Exams2_May_2017;

import java.util.*;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        for(LibraryMember m : members){

          List<CheckoutRecordEntry> checkoutEntries =  m.getCheckoutRecord().getCheckoutRecordEntries();
          if(checkoutEntries == null || checkoutEntries.isEmpty()) continue;

          for (CheckoutRecordEntry checkoutRecord: checkoutEntries){
                LendingItem recordItem =  checkoutRecord.getLendingItem();
                if(recordItem.equals(item)){
                      phoneNums.add(m.getPhone());
                      break;
                }
          }

        }

        Collections.sort(phoneNums);
        return  phoneNums;
    }
}