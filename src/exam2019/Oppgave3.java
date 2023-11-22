package exam2019;

import java.util.ArrayList;

class Bok{
    public String tittel;
    public String forfatter;
    public double pris;

    public Bok(String tittel,String forfatter,double pris){
        this.tittel=tittel;
        this.forfatter=forfatter;
        this.pris=pris;
    }

    public String getTittel() {
        return tittel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public double getPris() {
        return pris;
    }
}
class Lydbok extends Bok{
    private int lengdeIminutter;

    public Lydbok(int lengdeIminutter,String tittel,String forfatter,double pris){
        super(tittel, forfatter, pris);
        this.lengdeIminutter=lengdeIminutter;
    }
    public String toString(){
        String ut="Lydbok data : "+"\n";
        ut+="Lydboka er : "+this.lengdeIminutter+" minutter lang"+"\n";
        ut+="Tittelen til boka er "+this.tittel+"\n";
        ut+="Forfatteren er "+this.forfatter+"\n";
        ut+="Prisen er "+this.pris;
        return ut;
    }
}
class Papirbok extends Bok {
    private int ISBNnummer;

    public Papirbok(int ISBNnummer, String tittel, String forfatter, double pris) {
        super(tittel, forfatter, pris);
        this.ISBNnummer = ISBNnummer;
    }

    public String toString() {
        String ut = "Papirbok data : " + "\n";
        ut += "ISBNnummeret er : " + this.ISBNnummer + "\n";
        ut += "Tittelen til boka er " + this.tittel + "\n";
        ut += "Forfatteren er " + this.forfatter + "\n";
        ut += "Prisen er " + this.pris;
        return ut;
    }
}

public class Oppgave3 {
    public static void main(String []args) {

        ArrayList<Bok> liste = new ArrayList<>();

        Lydbok nyLydbok = new Lydbok(200, "ropeman", "atau", 33);

        Papirbok nyPapirbok = new Papirbok(195, "jumpman", "airpods", 1);

        liste.add(nyLydbok);
        liste.add(nyPapirbok);

        for (Bok enBok : liste) {
            System.out.println(nyLydbok);
            System.out.println(nyPapirbok);

        }
    }}


