package s4.model;

public class Magazine extends CommonProduct {


    private String periodicity;
    private String issn;
    private int circulation;

    
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
