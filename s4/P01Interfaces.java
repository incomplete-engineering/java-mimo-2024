package s4;

import s4.model.Person;
import s4.model.HavingName;
import s4.model.Pet;

public class P01Interfaces {
    //Ceci st notre première rencontre avec les interfaces.
    //C'est une sorte de vitrine ou façade qui nous donne une idée de l'**objet** 
    //sans les détails 
    
    //Par exemple les deux classes Person et Pet peuvent **implémenter** l'interface HavingName
  
    public static void main(String[] args) {
        HavingName named = getNameForFacture(100);
        System.out.println(named);
        HavingName named2 = getNameForFacture(1000);
        System.out.println(named2);
    }

    public static HavingName getNameForFacture(double facture) {
        if(facture < 1000) {
            Pet p = new Pet();
            p.setName("Chat");
            p.setProprio("Nell");
            return p;
        }
        Person p = new Person();
        p.setCountry("England");
        p.setFirstName("Little Nell");
        p.setLastName("");
        return p;
    }

}
