package s2;

import s2.data.Person;

public class P03Classes { 

    public static void main(String[] args) {
        
        Person dickens = new Person();   //type: Person, variable dickens, et initialisation (à voir plus bas)
        dickens.setFirstName("Charles");
        dickens.setLastName("Dickens");
        dickens.setAge(58);

        //La classe Person sert à "maintenir/contenir" des informations ensemble (firstName, lastName, age)
        //ces informations sont précédées par le mot "private" pour dire qu'elles ne sont pas _visibles_ à l'extérieur de la classe
        //On peut modifier ces informations via des méthodes appelées "setters"
        //Et on peut les lire via des "getters":
        System.out.println("Le nom de famille de notre auteur est: " + dickens.getLastName());
        //On dit que la classe **encapsule** ces informations, qu'on va appeler champs/attributs/fields


        //Une classe peut aussi avoir des méthodes qui ne sont ni getters ni setter:
        //System.out.println("Le nom complet de notre auteur est: " + dickens.getFullName());
        //On dit que la classe fait **abstraction** de ce qu'elle contient


        //dickens est un **objet** de type Person, on dit aussi une **instance**
        //on initialise tout objet via un **constructeur**
        //un constructeur est un type particulier de méthode sans retour.
        //toute classe contient implicitement un constructeur par défaut, [sauf si on en définit d'autres (à voir plus tard)]
        //c'est le cas pour Person ci haut.



        //Les classes sont regroupées dans des packages, exemple la classe Person est dans le package: s2.data
    }
    
}
