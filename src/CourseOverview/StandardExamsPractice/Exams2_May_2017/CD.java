package CourseOverview.StandardExamsPractice.Exams2_May_2017;

import java.util.Objects;

public class CD extends LendingItem{
    private String productId;
    private String title;
    private String company;
    private int numCopiesInLib;

    public CD(String productId, String title, String company) {
        super();
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int hashCode(){
        return Objects.hash(productId);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || o.getClass() != getClass()) return false;
        CD cd = (CD) o;
        return Objects.equals(productId,cd.getProductId());
    }


}
