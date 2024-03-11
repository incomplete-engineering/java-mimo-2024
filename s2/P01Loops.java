package s2;

public class P01Loops {
    public static void main(String[] args) {
        //Boucle for permettant de répéter un bloc d'instructions:
        for (int i = 0; i < 5; i++) {
            System.out.println("Ceci est un message statique"); //répétition d'un message statique
        }

        /*
        //Boucle for permettant de répéter un bloc plus compliqué:
        int max = 3;
        for (int counter = 0; counter <= max; counter++) {
            int doubleOfCounter = counter + counter;
            int squareOfCounter = counter * counter;
            String message = "Iteration: " + counter + " - Double = " + doubleOfCounter + " | Square = " + squareOfCounter;
            System.out.println(message);
        }
         */

        /*
        System.out.println("----------------------------------------------");
        // le keyword "break" permet de sortir d'une répétition
        // et le keyword "continue" permet de passer à la prochaine itération sans finir le bloc
        // exemple: afficher les 5 premiers diviseurs d'un nombre donné:
        int n = 100;
        int totalDiv = 0;
        for(int nbr = 1; nbr <= n; nbr++) {
            if(n % nbr != 0) {
                continue;//Si ce n'est pas un diviseur, alors passer à la prochaine itération sans exécuter le reste de l'itération courante
            }
            //Si on est ici c'est que c'est un diviseur de n
            System.out.println("Le nombre: " + nbr + " est un diviseur");
            totalDiv++; //Ceci est un raccourci pour incrémenter totalDiv
            if(totalDiv == 5) {
                break;//On sort de la boucle for si on atteint 5 diviseurs
            }
        }
        //N.B: quand n == 0 la boucle for ce-dessus n'affiche aucun diviseur
         */

        /*
        System.out.println("----------------------------------------------");
        //Un autre type de boucle est le "while":
        int n2 = 100;
        int totalDiv2 = 0;
        int nbr2 = 0;
        while (totalDiv2 < 5 && nbr2 <= n2) {
            nbr2++;
            if(n2 % nbr2 != 0) {
                continue;//on passe à la prochaine itération
            }
            System.out.println("Le nombre: " + nbr2 + " est un diviseur de " + n2);
            totalDiv2++;
        }
         */



        /*
        System.out.println("----------------------------------------------");
        //Il existe un autre type le "do while":
        int n3 = 100;
        int totalDiv3 = 0;
        int nbr3 = 0;
        do {
            nbr3++;
            if(n3 % nbr3 != 0) {
                continue;//on passe à la prochaine itération
            }
            System.out.println("Le nombre: " + nbr3 + " est un diviseur de " + n3);
            totalDiv3++;
        } while(totalDiv3 < 5 && nbr3 <= n3);

         */



        /*
        System.out.println("----------------------------------------------Exercice");

        //Exercice: explain and transform to for / while
        int nombre = 71;
        int seuil = 20;
        int sumDividers = 0;
        int idx = 1;
        do{
            idx++;
            if(nombre % idx == 0) {
                sumDividers += idx;
            }
        }while (sumDividers <= seuil && idx <= nombre);
        System.out.println(sumDividers);
         */
    }
}
