public class Second {
    
    public static void main(String[] args) {
        System.out.println("Starting our java program"); //cette ligne permet d'afficher un message
       
        String helloMessage;                               // On déclare une variable de nom: helloMessage et de type String càd: du texte
        helloMessage = "hello Mimo";                       // on donne (assigne) une valeur à cette variable
        System.out.println(helloMessage);                  // on utilise cette variable



        String secondHelloMessage = "second hello MIMO";    // on déclare et assigne une valeur à la varibale
        //System.out.println(secondHelloMessage);           // Si on ne l'utilise nulle part, le compilateur afficherait un warning: 
                                                            // "The value of the local variable secondHelloMessage is not used"

        
        //Autres types basiques:
        int age = 20;
        double temperature = 12.5;
        boolean isFebruary = true;
        char batiment = 'A';                                                            


        // l'opérateur "=" sert à l'assignement

        int sum = 10 + 25;   //operateur addition
        int diff  = 20 - 10;
        int product = 20 * 13;
        int div = 20 / 6;
        int remainder = 20 % 6;
        

        //Concat:
        String firstName = "Jane";
        String lastName = "Austen";
        String completeName = firstName + " " + lastName;

        //Comparaison:
        int firstAge = 23;
        int secondAge = 24;



        boolean areSameAge = firstAge == secondAge;
        boolean areDiffAges = firstAge != secondAge;
        boolean isFirstOlder = firstAge > secondAge;
        boolean isSecondOlderOrSame = secondAge >= firstAge;





        boolean isInTwenties = age >= 20 && age < 30;



        boolean isYoungOrSenior = age < 20 || age >= 60;

        


    }
}
