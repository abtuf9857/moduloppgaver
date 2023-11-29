package exam2021;

import java.util.ArrayList;

//superklasse
class Person{
    public String navn;
    public String adresse;
    public String telefonnr;

    //konstruktør
    public Person(String navn,String adresse,String telefonnr){
        this.navn=navn;
        this.adresse=adresse;
        this.telefonnr=telefonnr;
    }

    //toString metode for å skrive ut attributter
    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnr='" + telefonnr + '\'' +
                '}';
    }
}
//subklasse
class Student extends Person{
    private String studentnr;
    private String studienavn;

//konstruktør
    public Student(String navn,String adresse,String telefonnr,String studentnr,String studienavn){
        super(navn,adresse,telefonnr);
        this.studentnr=studentnr;
        this.studienavn=studienavn;
    }

    //toString metode for å skrive ut attributter
    @Override
    public String toString() {
        return "Student{" +
                "studentnr='" + studentnr + '\'' +
                ", studienavn='" + studienavn + '\'' +
                "} " + super.toString();
    }
}
//subklasse
class Ansatt extends Person {
    private String instituttnavn;
    private double lonn;

    //konstruktør
    public Ansatt(String navn, String adresse, String telefonnr, String instituttnavn, double lonn) {
        super(navn, adresse, telefonnr);
        this.instituttnavn = instituttnavn;
        this.lonn = lonn;
    }

    //toString metode for å skrive attributtene
    @Override
    public String toString() {
        return "Ansatt{" +
                "instituttnavn='" + instituttnavn + '\'' +
                ", lonn=" + lonn +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnr='" + telefonnr + '\'' +
                '}';
    }
}
public class Oppgave4 {
    //main metode som kompilerer alt
    public static void main(String[] args){
        ArrayList<Person>etStudie=new ArrayList<>();
        Student Tayyab=new Student("Tayyab","Berget12","456789","123","taxi");
        Ansatt Alam=new Ansatt("Alam","Tokerud 21","7887","transport",700000);
etStudie.add(Tayyab);
etStudie.add(Alam);
for (Person nyPerson:etStudie){
    System.out.println(nyPerson);
}

    }
}
