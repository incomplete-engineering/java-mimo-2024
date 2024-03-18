package s4.model;

public class Magazine implements Product {

    private String title;
    private String description;
    private double price;

    private String periodicity;
    private String issn;
    private int circulation;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getPeriodicity() {
        return periodicity;
    }
    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }
    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getCirculation() {
        return circulation;
    }
    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }
    

}
