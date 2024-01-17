package kontexam2022;
class Personalia{
    private String navn;
   private String adresse;
    private String telefonnr;

    public Personalia(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Personalia : " +
                "navn : " + navn + '\'' +
                "adresse : " + adresse + '\'' +
                "telefonnr : " + telefonnr ;
    }
}
class Student extends Personalia{
    private String studentnr;
    public Student(String navn,String adresse,String telefonnr,String studentnr){
        super(navn, adresse, telefonnr);
        this.studentnr=studentnr;

    }

    public String toString() {
        return super.toString()+
                "studentnr: "+studentnr;
    }
}
class Ansatt extends Personalia{
    private String tittel;
    public Ansatt(String navn,String adresse,String telefonnr,String tittel){
        super(navn, adresse, telefonnr);
        this.tittel= tittel;
    }

    @Override
    public String toString() {
        return super.toString()+
        "tittel er : " +tittel;
    }
}
public class Oppgave3 {
    public static void main(String[]args){
        Student Abdurahim=new Student("AB","QLF","34","43");
        Ansatt Tufa=new Ansatt("Ba","PNL","32","grov neg");
        System.out.print(Abdurahim+"\n"+Tufa);

    }
}
