/*Lag en while-løkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre
 (0 til og med 9).
 */

package kontrollstrukturer2;
public class Oppgave6 {
    public static void main(String[]args){
        int sum=0;
        int i=0;
        while (i < 10) {
            sum+=i;
            i++;
        }
        System.out.println("Summen av tallene mellom 0 og 9 er "+sum);
    }
}
