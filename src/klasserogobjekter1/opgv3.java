package klasserogobjekter1;

class Person {
public String navn;
public String adresse;
public String telefonnr;
public int fødtselsår;

public int alder () {
    return 2023 - fødtselsår;
 }

 public void skrivUt(int alder){
    String ut= navn+" med adressen "+adresse+ " med telefonnr "+telefonnr+
            " er "+alder+" år.";
     System.out.print(ut);
 }
}

public class opgv3 {
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