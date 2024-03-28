package s4.model;


public class Book extends CommonProduct  {
    
    private String isbn;
    private String authorName;
    private int nbrPages;
    
    public String describe() {
        return title + " by: " + authorName;
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
