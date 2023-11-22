package Interface;

interface Kjøretøy{
    public String toString();
}

class Dato {
    private final int dag;
    private final int måned;
    private final int år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"};
        if (mnd > 0 && mnd < 13) return navn[mnd - 1];
        else return "ukjent måned";
    }

    public String toString() {
        String ut = dag + "." + " " + månedsnavn(måned) + " " + år;// lag denne
        return ut;
    }
}

class Motorsykkel implements Kjøretøy {
    public String typebetegnelse;
    public Dato førstegangsregistrert;
    public String kjennetegn;
    public Motorsykkel(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn) {
        this.typebetegnelse=typebetegnelse;
        this.førstegangsregistrert=førstegangsregistrert;
        this.kjennetegn=kjennetegn;
}
    public String toString(){
        String ut="Informasjon om motorsykkelen min: \n";
        ut+="Modellen er : "+this.typebetegnelse+"\n";
        ut+="Den ble førstegangsregistrert : "+this.førstegangsregistrert+"\n";
        ut+="Skiltnummeret er : "+this.kjennetegn+"\n";
        return ut;
    }
}
class Bil implements Kjøretøy {
    public String typebetegnelse;
    public Dato førstegangsregistrert;
    public String Kjennetegn;
    public int lastekapasitet;

    public Bil(String typebetegnelse,Dato førstegangsregistrert,String Kjennetegn,int lastekapasitet){

    this.typebetegnelse=typebetegnelse;
    this.førstegangsregistrert=førstegangsregistrert;
    this.Kjennetegn=Kjennetegn;
    this.lastekapasitet=lastekapasitet;

    }
    public String toString() {
        String ut = "Informasjon om bilen min: \n";
        ut += "Modellen er : " + this.typebetegnelse + "\n";
        ut += "Den ble førstegangsregistrert : " + this.førstegangsregistrert + "\n";
        ut += "Skiltnummeret er : " + this.Kjennetegn + "\n";
        ut += "lastekapasiteten er : "+this.lastekapasitet+ "\n";
        return ut;
    }
}

public class interfacee {

    public static void main(String[] args) {
        // opprett et array av Biler
        // Sett inn noen biler i arrayet

        Kjøretøy[] kjøretøy = new Kjøretøy[4];
        Bil bil1 = new Bil("Audi A6", new Dato(16, 11, 2020), "TU12",1000);
        kjøretøy[0] = bil1;
        Bil bil2 = new Bil("Merces C63", new Dato(15, 11, 2021), "TU11",1000);
        kjøretøy[1] = bil2;
        Bil bil3 = new Bil("BMW 5 SERIE", new Dato(17, 11, 2022), "TU10",1000);
        kjøretøy[2] = bil3;
        kjøretøy[3] = new Motorsykkel("Toyota Prius", new Dato(18, 11, 2023), "Tu9");

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for (int i = 0; i < kjøretøy.length; i++) {
            System.out.println(kjøretøy[i]);
        }


    }
}

