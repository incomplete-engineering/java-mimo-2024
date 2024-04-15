package edu.sorbonne.mimo;

import edu.sorbonne.mimo.api.BookAndAuthorDto;
import edu.sorbonne.mimo.service.BookManager;

public class App {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        BookAndAuthorDto book = bookManager.getBook("1234");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Isbn: " + book.getIsbn());
        System.out.println("Author: " + book.getAuthorName());
        System.out.println("About: " + book.getAuthorBio());
    }
}
