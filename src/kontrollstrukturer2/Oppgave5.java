/*Lag en while-løkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre
 (0 til og med 9).
 */

package kontrollstrukturer2;
public class Oppgave5 {
    public static void main(String []args){


    int teller=0;
    while(teller<10) {
        System.out.println(teller + " ");
        teller = teller + 1;
    }
    }
}
