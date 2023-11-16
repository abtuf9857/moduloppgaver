package MeromKlasserogObjekter1;

import java.util.Arrays;

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString() {
    String ut=dag+"."+" "+månedsnavn(måned)+" "+år;// lag denne
        return ut;
        }
    }


class Bil {
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer
    public String typebetegnelse;
    public Dato førstegangsregistrert;
    public String kjennetegn;


    // lag også konstruktør for alle attributtene
    public Bil(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn){
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregistrert = førstegangsregistrert;
        this.kjennetegn = kjennetegn;
    }


    // lag så en toString metode for å vise alle attributtene

public String toString(){
        String ut="Informasjon om bilen min: \n";
        ut+="Modellen er : "+this.typebetegnelse +"\n";
        ut+="Den ble førstegangsregistrert : "+this.førstegangsregistrert +"\n";
        ut+="Skiltnummeret er : "+this.kjennetegn +"\n";
        return ut;
}

}

public class Motorvogn {

    public static void main(String[] args) {
        // opprett et array av Biler
        // Sett inn noen biler i arrayet

        Bil [] biler = new Bil[4];
        Bil bil1= new Bil("Audi A6",new Dato(16,11,2020),"TU12");
        biler[0] = bil1;
        Bil bil2= new Bil("Merces C63",new Dato(15,11,2021),"TU11");
        biler[1]=bil2;
        Bil bil3= new Bil("BMW 5 SERIE",new Dato(17,11,2022),"TU10");
        biler[2]=bil3;
        biler[3]=new Bil("Toyota Prius",new Dato(18,11,2023),"Tu9");

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for(int i=0;i< biler.length;i++){
            System.out.println(biler[i]);
        }


    }
}