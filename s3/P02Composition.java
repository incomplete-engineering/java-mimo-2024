package s3;

import s3.data.Author;
import s3.data.Book;

public class P02Composition {
    public static void main(String[] args) {
        //Une classe peut références des objets d'autres classes (ou de la même classe)
        Author dickens = new Author("Charles Dickens", "England", 1812);
        Book davidCopperfield = new Book();
        davidCopperfield.setAuthor(dickens);
        davidCopperfield.setTitle("David Copperfield");
        davidCopperfield.setPresentation("David Copperfield is a novel by Charles Dickens");

        System.out.println(davidCopperfield.combineTitleAuthor());

        //Ces exemples semblent êtres simplistes, mais la plupart des applications entreprises consistent
        //à créer des objets et à les persister dans des bases de données, ou l'inverse.


        //la référence "null"
        
    }
}
