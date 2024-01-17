package exam2022;

import java.util.ArrayList;

/*Det skal lages et program som registrer bøker i en boksamling. Klassene, attributtene og
metodene som skal implementeres illustreres i overstående klasse-diagram. Lydbok og Papirbok
arver Bok-klassen. Det er bare metodene illustrert i klasse-diagrammet som skal
implementeres.
I main-metoden skal det så opprettes et objekt av hver type (Lydbok og Papirbok). Disse skal så
legges inn i en ArrayList av type Bok. Deretter skal attributtene skrives ut i en løkke ved hjelp av
toString()-metodene.*/
class Bok{
    public String tittel;
    public String forfatter;
    public double pris;

    public Bok(String tittel,String forfatter,double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }
    @Override
    public String toString() {
        return "Bok{" +
                "tittel='" + tittel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", pris=" + pris +
                '}';
    }
}
class Lydbok extends Bok{
    private String lengdeIminutter;
    public Lydbok(String tittel,String forfatter,double pris,String lengdeIminutter){
        super(tittel, forfatter, pris);
        this.lengdeIminutter=lengdeIminutter;
    }

    @Override
    public String toString() {
        return "Lydbok{" +
                "lengdeIminutter='" + lengdeIminutter + '\'' +
                ", tittel='" + tittel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", pris=" + pris +
                '}';
    }
}
class Papirbok extends Bok{
    private String ISBNnummer;
    public Papirbok(String tittel,String forfatter,double pris,String ISBNnummer){
        super(tittel, forfatter, pris);
        this.ISBNnummer=ISBNnummer;
    }

    @Override
    public String toString() {
        return "Papirbok{" +
                "ISBNnummer='" + ISBNnummer + '\'' +
                ", tittel='" + tittel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", pris=" + pris +
                '}';
    }
}
public class Oppgave5 {
    public static void main(String[]args){
        ArrayList<Bok>bokstack=new ArrayList<>();
Papirbok nyPapirbok=new Papirbok("Tretre","TOTO",78,"45631");
Lydbok nyLydbok=new Lydbok("Toto","ototo",98,"98");

bokstack.add(nyPapirbok);
bokstack.add(nyLydbok);
for(Bok nyBok:bokstack){
    System.out.println(nyBok);
}


    }
}
