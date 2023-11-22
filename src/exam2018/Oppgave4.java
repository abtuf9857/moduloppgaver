package exam2018;

/*Koden som skal kompleteres (sluttføres) vises til venstre. 3 kode-biter skal lages:
1) Fullfør klassen Ansatt
2) Skriv toString metoden i klassen Dato
3) Fullfør main-metoden.
Skriv ditt svar her...
 */

class Dato{
    int dag;
    int måned;
    int år;

    public Dato(int dag,int måned,int år){
        this.dag=dag;
        this.måned=måned;
        this.år=år;

    }
    public String toString() {
        String ut = dag + "." + måned + "." + år;
        return ut;
    }
}
class Ansatt{
    Dato oppstart;
    String navn;
    int alder;

    }

public class Oppgave4{
    public static void main(String []args){
Ansatt nyAnsatt=new Ansatt();
nyAnsatt.oppstart=new Dato(21,11,2015);
nyAnsatt.navn=" Tufa den grove ";
nyAnsatt.alder=37;
        System.out.print(nyAnsatt);
    }
}