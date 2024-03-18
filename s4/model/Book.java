package s4.model;

public class Book implements Product {
    
    private String title;
    private String description;
    private double price;

    private String isbn;
    private String authorName;
    private int nbrPages;

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
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getNbrPages() {
        return nbrPages;
    }
    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    
}
