/*Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut
alderen ut i fra fødselsår. Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.

 */
package klasserogobjekter1;

//klasse med objekter
class Person {
public String navn;
public String adresse;
public String telefonnr;
public int fødtselsår;

//metode for å regne ut alder
public int alder () {

    return 2023 - fødtselsår;
 }

 //metode for å skrive ut objektene
 public void skrivUt(int alder){
    String ut= navn+" med adressen "+adresse+ " med telefonnr "+telefonnr+
            " er "+alder+" år.";
     System.out.print(ut);
 }
}

public class opgv3 {
    //instansiering av objektene i klassen person
    public static void main(String []args){
     Person enPerson= new Person();
     enPerson.navn= " Deebow Wagwan";
     enPerson.adresse= " Stovner Senter 1";
     enPerson.telefonnr=" 45767656";
     enPerson.fødtselsår= 2004;
     int alder= enPerson.alder();
     enPerson.skrivUt(alder);

    }
}