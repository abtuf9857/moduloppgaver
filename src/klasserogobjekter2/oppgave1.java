/*Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike
feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.

 */
package klasserogobjekter2;

import static javax.swing.JOptionPane.*;

//klasse med fire private attributter
class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    //metode for å lese inn attributtene

    public void data (){
        showMessageDialog(null,fornavn+" "+ " "+etternavn+" "+adresse+" " +telefonnr);
    }

    //get set metoder for alle attributtene
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    //konstruktør
    private Person(String fornavn, String etternavn, String adresse, int telefonnr){
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.adresse=adresse;
        this.telefonnr=telefonnr;

    }

//main metode som leser inn attributtene
    public static void main (String []args) {
         Person Tufa= new Person("Abdurahim" ,"Tufa ","Stovner Senter 1", 45857697 );
         Tufa.data();
    }

}
