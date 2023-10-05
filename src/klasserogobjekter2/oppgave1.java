
package klasserogobjekter2;

import static javax.swing.JOptionPane.*;
class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    public void data (){
        showMessageDialog(null,fornavn+" "+ " "+etternavn+" "+adresse+" " +telefonnr);
    }

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

    private Person(String fornavn, String etternavn, String adresse, int telefonnr){
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.adresse=adresse;
        this.telefonnr=telefonnr;

    }


    public static void main (String []args) {
         Person Tufa= new Person("Abdurahim" ,"Tufa ","Stovner Senter 1", 45857697 );
         Tufa.data();
    }

}
