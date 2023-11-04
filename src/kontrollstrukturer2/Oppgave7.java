/*Lag en while-løkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene
(0 til og med 18).
 */

package kontrollstrukturer2;
public class Oppgave7 {
    public static void main(String[]args){
        int teller=0;
        while (teller < 20) {
            System.out.println(teller+" ");
            teller=teller+2;
        }
    }
}
