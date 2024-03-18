package s4;

import java.util.List;

import s3.data.Author;

public class P02Generics {
    //Concept légèrement compliqué. On va uniquement son usage ici:

    public static void main(String[] args) {
        //en programmation, on a un concept de conteneur. Des structures qui __contiennent__ 
        //des éléments de type différent à chaque fois.
        //L'exemple le plus concret c'est la structure liste. Cette structure peut contenir des String, des entiers, des structures plus complexes.
        //Bien sûr dans Java on parle plutot de classes que de structure. 
        //Et il existent plusieurs types ("implémentations") de listes. 
        //C'est pour ça, qu'on a une interface List dans le package java.util.
        //Pour avoir un conteneur, qui peut contenir ou plus généralement s'appliquer à plusieurs classes, on utilise le concept de généricité
        //On dit qu'une classe ou une interface est générique, si elle peut s'appliquer à plusieurs types 
        //(ceci est une définition approximative, mais suffisante pour l'usage courant. Plus de détails dans les séances à venir)
        //On utilise une classe ou interface générique à l'aide des <> comme suit:
        List<String> names = List.of("Austen", "Dickens", "Balzac");  //On dit que "names est une liste de String"
        System.out.println("Nous avons: " + names.size() + " auteurs");


        Author dickens = new Author("Charles Dickens", "England", 1812);
        Author balzac = new Author("Honoré de Balzac", "France", 1799);
        Author shikibu = new Author("Murasaki Shikibu", "Japan", -1);

        List<Author> authors = List.of( //On dit que "authors est...."
            shikibu, balzac, dickens
        );

        System.out.println("Nous avons: " + authors.size() + " auteurs");
    }
}
