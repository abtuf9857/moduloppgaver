package oppgaver;

import static javax.swing.JOptionPane.*;


class Person1 {
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødtselsår;

    public int alder () {
        return 2023 - fødtselsår;
    }

    public void skrivUt(int alder){
        String ut= "Navn: " +navn+"\nAdresse : "+adresse+ "\n telefonnr "+telefonnr+
                "\n er "+alder+" år.";
        showMessageDialog(null,ut);
    }
}

public class opgv4 {
    public static void main(String []args){
        Person1 enPerson= new Person1();

        String navn= showInputDialog("Navn :");
        String telefonnr= showInputDialog("Telefonnr : ");
        String adresse= showInputDialog("Adresse : ");
        String innFødtselsår= showInputDialog("Fødtselsår : ");
        int fødtselsår= Integer.parseInt(innFødtselsår);

        enPerson.navn= navn;
        enPerson.adresse= adresse;
        enPerson.fødtselsår=fødtselsår;
        enPerson.telefonnr=telefonnr;

        int alder= enPerson.alder();
        enPerson.skrivUt(alder);
    }
}
