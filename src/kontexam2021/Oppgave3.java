package kontexam2021;

class Fag{
    String fagnavn;
    String årstall;

    public Fag(String fagnavn, String årstall) {
        this.fagnavn = fagnavn;
        this.årstall = årstall;
    }

    public String getFagnavn() {
        return fagnavn;
    }

    public void setFagnavn(String fagnavn) {
        this.fagnavn = fagnavn;
    }

    public String getÅrstall() {
        return årstall;
    }

    public void setÅrstall(String årstall) {
        this.årstall = årstall;
    }

    @Override
    public String toString() {
        return "Fag: " + fagnavn+","+" år " +årstall;
    }
}
class Student{
    String navn;
    String studnr;

    public Student(String navn, String studnr) {
        this.navn = navn;
        this.studnr = studnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudnr() {
        return studnr;
    }

    public void setStudnr(String studnr) {
        this.studnr = studnr;
    }

    @Override
    public String toString() {
        return "Student : " +
                "navn=" + navn +","+
                "studnr= " + studnr;
    }
}

public class Oppgave3 {
   public static void main(String[]args) {
       Student[] liste = new Student[10];
       Student Kari = new Student("Kari Olsen", "S23456");
       Student Ole = new Student("Ole Hansen", "S356734");
       liste[0] = Kari;
       liste[1] = Ole;
       Fag nyFag = new Fag("Programmering", "2020");

   }

}
