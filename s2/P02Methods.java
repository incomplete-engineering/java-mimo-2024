package s2;

public class P02Methods {
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------");
        String firstName = "Charles";
        String lastName = "Dickens";
        String fullName = concat(firstName, lastName);
        System.out.println("Notre écrivain du jour est: " + fullName);

        /*
        System.out.println("----------------------------------------------");
        int sumOfEven = 0;
        for (int i = 0; i < 10; i++) {
            if(isEven(i)) {
                sumOfEven += i; //raccourci pour dire on ajoute la valeur de "i" à sumOfEven
            }
        }
        System.out.println("La somme des nombres pairs inférieurs à 10 est: " + sumOfEven);
         */

        /*
        System.out.println("----------------------------------------------");
        int score = 199;
        int result = halfOrHundred(score);
        System.out.println("Résultat: " + result);

         */

        //Exercice: afficher la somme des nombres impairs < 10 en utilisant la même méthode isEven
        //Exercice2: afficher une chaine qui contient les nombres impairs séparés par des espaces " "
    }

    static String concat(String first, String last) {//méthode statique (on verra ça plus tard). elle retourne un String
                                                     // elle s'appelle "concat" et prend en param deux String
        return first + " " + last; //ceci est l'implémentation de la méthode
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int halfOrHundred(int number) {
        int half = number / 2;
        if(half > 100) {
            return half;
        }
        return 100;
    }
}
