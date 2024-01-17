package kontexam2022;


class personalia{
    private String navn;
    private String adresse;
    private String telefonnr;

    public personalia(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "personalia: " +
                "navn= " + navn + '\'' +
                "adresse= " + adresse + '\'' +
                "telefonnr =" + telefonnr + '\'';
    }
}
class Sttudent extends personalia{
    private String studentnr;

    public Sttudent(String navn,String adresse,String telefonnr,String studentnr){
        super(navn, adresse, telefonnr);
        this.studentnr=studentnr;
    }
    public String toString(){
        return super.toString()+"Studentnr er "+studentnr;
    }
}
class Annsatt extends personalia{
    private String tittel;
    public Annsatt(String navn,String adresse,String telefonnr,String tittel){
        super(navn, adresse, telefonnr);
        this.tittel=tittel;
    }
    public String toString(){
        return super.toString()+"Tittelen er "+tittel;
    }
}

public class åpgv3 {
    public static void main(String[]args){
        Sttudent deebow=new Sttudent("Deebow","Stovner Senter 1","4567","67");
        Annsatt deebo=new Annsatt("deebo","Stovner Senter 1","8765","Grov neg");
        System.out.println(deebow);
        System.out.println(deebo);

    }
}
