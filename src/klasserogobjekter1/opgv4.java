/*Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks
på følgende format:
 */
package klasserogobjekter1;

import static javax.swing.JOptionPane.*;

//klasse med objekter
class Person1 {
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødtselsår;

    //metode for å regne ut alder
    public int alder () {
        return 2023 - fødtselsår;
    }

    //metode for å skrive ut variablene i en meldingsboks med ny linje
    public void skrivUt(int alder){
        String ut= "Navn: " +navn+"\nAdresse : "+adresse+ "\n telefonnr "+telefonnr+
                "\n er "+alder+" år.";
        showMessageDialog(null,ut);
    }
}

public class opgv4 {
    public static void main(String []args){

        //innlesing av personalia med input bokser
        Person1 enPerson= new Person1();
        String navn= showInputDialog("Navn :");
        String telefonnr= showInputDialog("Telefonnr : ");
        String adresse= showInputDialog("Adresse : ");
        String innFødtselsår= showInputDialog("Fødtselsår : ");
        int fødtselsår= Integer.parseInt(innFødtselsår);
        int alder= enPerson.alder();

        //instansiering av objektene i klassen Person
        enPerson.navn= navn;
        enPerson.adresse= adresse;
        enPerson.fødtselsår=fødtselsår;
        enPerson.telefonnr=telefonnr;

        enPerson.skrivUt(alder);
    }
}
