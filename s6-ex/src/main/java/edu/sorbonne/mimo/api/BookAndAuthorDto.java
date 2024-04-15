package edu.sorbonne.mimo.api;

import edu.sorbonne.mimo.model.Author;
import edu.sorbonne.mimo.model.Book;

public class BookAndAuthorDto {

    private String isbn;
    private String title;
    private String authorName;
    private String authorBio;
    
    public BookAndAuthorDto(Book book, Author author) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.authorName = author.getName();
        this.authorBio = author.getBio();   
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorBio() {
        return authorBio;
    }
    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    
}
