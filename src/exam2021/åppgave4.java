package exam2021;

import java.util.ArrayList;

class Pperson{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Pperson(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Personinfo : " +
                "navnet er " + navn + '\'' +
                ", adressen er " + adresse + '\'' +
                ", telefonummeret er " + telefonnr;
    }
}
class Stuudent extends Pperson{
    private String studentnr;
    private String studienavn;
    public Stuudent(String navn,String adresse,String telefonnr,String studentnr,String studienavn){
        super(navn, adresse, telefonnr);
        this.studienavn=studienavn;
        this.studentnr=studentnr;
    }
    public String toString(){
        return super.toString()+
                "Studentnr er "+studentnr+"\n"
                +"Studienavn er "+studienavn;
    }
}
class Aansatt extends Pperson{
    private String instituttnavn;
    private double lønn;
    public Aansatt(String navn,String adresse,String telefonnr,String instituttnavn,double lønn){
        super(navn, adresse, telefonnr);
        this.instituttnavn=instituttnavn;
        this.lønn=lønn;
    }
    public String toString(){
        return super.toString()+
                "Institutt navnet er "+instituttnavn+"\n"+"lønna er "+lønn;
    }
}
public class åppgave4 {
    public static void main(String[]args){
        ArrayList<Pperson>personer=new ArrayList<>();
        Stuudent De=new Stuudent("Tufa","S-town","68","32","død");
        Aansatt Gre=new Aansatt("Afut","B-town","34","grovhet",4505673);

        personer.add(De);
        personer.add(Gre);

        for(Pperson nyP:personer){
            System.out.println(nyP);
        }

    }
}
