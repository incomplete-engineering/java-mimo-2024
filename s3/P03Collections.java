package s3;

import java.util.ArrayList;
import java.util.List;

import s3.data.Author;

public class P03Collections {
    public static void main(String[] args) {
        //Exercice: expliquez les lignes suivantes:
        Author dickens = new Author("Charles Dickens", "England", 1812);
        Author balzac = new Author("Honoré de Balzac", "France", 1799);
        Author shikibu = new Author("Murasaki Shikibu", "Japan", -1);
        List<Author> authors = List.of(
            shikibu, balzac, dickens
        );

        System.out.println("Nous avons: " + authors.size() + " auteurs");
    }
}
