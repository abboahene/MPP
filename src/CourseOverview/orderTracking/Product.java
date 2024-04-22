package CourseOverview.orderTracking;

public class Product implements IProduct{
    private String description;
    private String productNumber;
    private double price;

    private ICompPoints compPoints;

    public Product( String description, String productNumber, double price, ICompPoints compPoints) {
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.compPoints = compPoints;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ICompPoints getCompPoints() {
        return compPoints;
    }

    public void setCompPoints(ICompPoints compPoints) {
        this.compPoints = compPoints;
    }
}
