/*Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)

 */

package kontrollstrukturer2;
public class Oppgave4 {
    public static void main(String[]args){
        int sum=0;
        int teller=0;
        for (int i = 0; i<100; i+=2){
            sum+=i;
            teller++;
        }
        System.out.println("Summen av alle partallene fra 0 til 98 er "+sum);
        double gjennomsnitt=(double)sum/(double)teller;
        System.out.println("Gjennomsnittet av alle partallene fra 0 til 98 er "+gjennomsnitt);
    }
}
