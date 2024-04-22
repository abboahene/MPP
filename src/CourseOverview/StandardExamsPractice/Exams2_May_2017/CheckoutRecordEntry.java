package CourseOverview.StandardExamsPractice.Exams2_May_2017;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem lendingItem;
    private ItemType itemType;

    public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.lendingItem = lendingItem;
        this.itemType = itemType;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
