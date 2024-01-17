package kontexam2020;

class Bok{
    private String tittel;
    private String forfatter;

    public Bok(String tittel, String forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;

    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }
    public String toString(){
        String ut="Bok info : "+"\n";
        ut+="Tittel til bok er "+tittel;
        ut+="Forfatter av bok er "+forfatter;
        return ut;
    }
}
class Forfatter{
    private String navn;
    private String født;

    public Forfatter(String navn, String født) {
        this.navn = navn;
        this.født = født;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFødt() {
        return født;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    @Override
    public String toString() {
        return "forfatterinfo"+"\n"+
                "navn " + navn + '\'' +
                " født " + født + '\''
                ;
    }
}

public class Oppgave3 {
    public static void main(String[]args){
        Bok nyBok=new Bok("Beste boka ."," Beste forfatter"+"\n");
        Forfatter nyforfatter=new Forfatter("Tufa","20.01.2004");
        System.out.println(nyBok+" "+nyforfatter);

    }
}
