package s5.repository;

import java.util.ArrayList;
import java.util.List;

import s5.model.Book;
import s5.model.BookCategory;

public class InMemoryBookRepositoryImpl implements BookRepository{

    List<Book> stock;

    public InMemoryBookRepositoryImpl() {
        this.stock = new ArrayList<>();


        Book oldCuriosity = new Book();
        oldCuriosity.setTitle("The Old Curiosity Shop");
        oldCuriosity.setAuthorName("Charles Dickens");
        oldCuriosity.setDescription("It was so popular that New York readers stormed the wharf when the ship bearing the final instalment arrived in 1841");
        oldCuriosity.setIsbn("9780140437423");
        oldCuriosity.setNbrPages(608);
        oldCuriosity.setPrice(11.18);
        oldCuriosity.setCategory(BookCategory.FICTION);
        this.stock.add(oldCuriosity);

        Book dawnOfEverything = new Book();
        dawnOfEverything.setTitle("The Dawn of Everything");
        dawnOfEverything.setAuthorName("David Graeber");
        dawnOfEverything.setDescription("The Dawn of Everything: A New History of Humanity is a 2021 book by anthropologist and activist David Graeber, and archaeologist David Wengrow");
        dawnOfEverything.setIsbn("9780241402429");
        dawnOfEverything.setNbrPages(704);
        dawnOfEverything.setPrice(17.36);
        dawnOfEverything.setCategory(BookCategory.NON_FICTION);

        this.stock.add(dawnOfEverything);

    }

    @Override
    public List<Book> findByTile(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : stock) {
            String currentTitle = book.getTitle();
            if(currentTitle.contains(title)) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public Book findByIsbn(String isbn) {
        for (Book book : stock) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        this.stock.add(book);
        return book;
    }
    
}
