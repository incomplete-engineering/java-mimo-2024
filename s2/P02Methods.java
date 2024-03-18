package s2;

public class P02Methods {
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------");
        String firstName = "Charles";
        String lastName = "Dickens";
        String fullName = concat(firstName, lastName);
        String fullNameV2 = concat(firstName, lastName, " - ");
        System.out.println("Notre écrivain du jour est: " + fullName);


        int net = 100_000;
        double impots = taxes(net);
        System.out.println("Impots: " + impots);


        
        System.out.println("----------------------------------------------");
        int sumOfEven = 0;
        for (int i = 0; i < 10; i++) {
            if(isEven(i)) {
                sumOfEven += i; //raccourci pour dire on ajoute la valeur de "i" à sumOfEven
            }
        }
         

        
        System.out.println("----------------------------------------------");
        int score = 199;
        int result = halfOrHundred(score);
        System.out.println("Résultat: " + result);

         

        //Exercice: afficher la somme des nombres impairs < 10 en utilisant la même méthode isEven
        int sumOfOdd = 0;
        for(int i = 0; i < 10; i++) {
            if(!isEven(i)) {
                sumOfOdd += i;
            }
        }

        //Exercice2: afficher une chaine qui contient les nombres impairs séparés par des espaces " "

        // 1 3 5 7 9
        String concatOdds = "";
        for(int i = 0; i < 10; i++) {
            if(!isEven(i)) {
                concatOdds = concatOdds + i + " ";
            }
        }
        System.out.println(concatOdds);


        printHello("Charles Dickens");
        printHello("Jane Austen");

    }

    static String concat(String first, String last) {//méthode statique (on verra ça plus tard). elle retourne un String
                                                     // elle s'appelle "concat" et prend en param deux String
        return concat(first, last, " "); //ceci est l'implémentation de la méthode
    }

    static String concat(String first, int age) {
        return first + ": " + age; 
    }

    static String concatener(int age, String first) {
        return first;
    }

    
    static void printHello(String name) {
        System.out.println("Hello: " + name);
    }
   

    static String concat(String first, String last, String sep) {
        return first + sep + last; 
    }

    

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int halfOrHundred(int number) {
        int half = number / 2;
        if(half > 100) {
            System.out.println("le half est: " + half);
            return half;
        }
        return 100;
    }

    static double taxes(int net) {
        if(net <= 11294) {
            return 0;
        }
        if(net <= 28797) {
            int diff = net - 11294;
            return diff * 0.11;
        }
        double deuxiemePalier = (28797 - 11294) * 0.11;
        if(net <= 82341) {
            int diff = net - 28797;
            double taxesInThirty = diff * 0.3;
            return deuxiemePalier + taxesInThirty;
        }
        double thirdPalier = (82341 - 28797) * 0.3;
        if(net <= 177106) {
            int diff = net - 82341;
            double taxesInFourth = diff * 0.41;
            return deuxiemePalier + thirdPalier + taxesInFourth;
        }
        double fourthPalier = (177106 - 82341) * 0.41;
        int diff = net - 177106;
        double taxesInFifth = diff * 0.45;
        return deuxiemePalier + thirdPalier + fourthPalier + taxesInFifth;
    }
}
