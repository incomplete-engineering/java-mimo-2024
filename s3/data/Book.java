package s3.data;

public class Book {

    private String title;
    private Author author;
    private String presentation;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getPresentation() {
        return presentation;
    }
    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    
    public String combineTitleAuthor() {
        return "'" + title + "' by " + author.getName();
    }
}
