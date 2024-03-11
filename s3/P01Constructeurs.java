package s3;

import s3.data.Author;

public class P01Constructeurs {

    public static void main(String[] args) {
        //on importe la classe Author du package "s3.data" avec le mot clé "import"
        Author balzac = new Author("Honoré de Balzac", "France", 1799);
        //on instancie l'objet balzac avec le contructeur à 3 paramètres de la classe Author

        //Pour certains auteurs, on n'a pas l'information année de naissance, et on veut mettre une valeur "-1" dans ce cas:
        //on ajoute un nouveau constrcuteur qui accepte deux paramètres
        //Author shikibu = new Author("Murasaki Shikibu", "Japan");

        //Un constructeur/méthode d'un objet, __s'exécute dans le cadre (au sein) de cet objet__. D'où le mot clé "this"
        //qui fait référence à l'objet concerné.


        //Quand une classe définit un constructeur à paramètres, le constructeur par défaut n'est plus fourni implicitement
        //il faut le définir si besoin
    }
    
}