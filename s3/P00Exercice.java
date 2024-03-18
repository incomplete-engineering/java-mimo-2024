package s3;

import s3.data.Module;

public class P00Exercice {
    public static void main(String[] args) {
        Module m = new Module();
        m.setModuleName("Java");
        m.setDsNote(10);
        m.setTpNote(12);
        m.setExamNote(15);

        String resultat = m.getMoyenne();
        System.out.println(resultat);
    }
}
