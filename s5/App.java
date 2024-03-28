package s5;

import java.util.List;

import s5.model.Book;
import s5.model.BookCategory;
import s5.repository.BookRepository;
import s5.repository.InMemoryBookRepositoryImpl;

public class App {  
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepositoryImpl();

        String searchQuery = "Dawn of Everything";
        List<Book> searchResult = bookRepository.findByTile(searchQuery);
        System.out.println("Books in stock for query: '" + searchQuery+"':");
        for (Book book : searchResult) {
            System.out.println(book.getTitle() + ". By: " + book.getAuthorName() + ". Price: " + book.getPrice());
        }
        System.out.println("---------------------");
        Book fromDb = bookRepository.findByIsbn("abc");
        if(fromDb != null) {
            System.out.println("Found book: ");
            System.out.println(fromDb.getTitle() + ". By: " + fromDb.getAuthorName() + ". Price: " + fromDb.getPrice());    
        } else {
            System.out.println("Aucun livre n'a été trouvé pour: abc");
        }
        

        Book tourDuMonde = new Book();
        tourDuMonde.setTitle("Le Tour du Monde en Quatre-Vingts Jours");
        tourDuMonde.setAuthorName("Jules Verne");
        tourDuMonde.setDescription("Le Tour du Monde en Quatre-Vingts Jours est un roman d'aventures");
        tourDuMonde.setIsbn("9782253012696");
        tourDuMonde.setCategory(BookCategory.FICTION);
        bookRepository.saveBook(tourDuMonde);

    }
}
