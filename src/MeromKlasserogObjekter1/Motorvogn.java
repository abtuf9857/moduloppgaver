package MeromKlasserogObjekter1;

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
    String ut=månedsnavn(måned);// lag denne
        return ut;
        }
    }


class Bil{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene

}

public class Motorvogn {

    public static void main(String[] args) {
        // opprett et array av Biler

        // Sett inn noen biler i arrayet

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

    }
}