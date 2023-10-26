package Obligue3;


import java.sql.Array;
import java.util.Scanner;

public class UnikeTall{

    // Deklarasjon av array for lagring av tilfeldige heltall
    int[]array;

    /* Konstruktør som mottar arrayets lengde som parameter og
    oppretter arrayet.  */
    public UnikeTall(int myArraylengde){
        array = new int[myArraylengde];

    }

    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */
    public void tilfeldigTall(){
        for (int i = 0; i < array.length; i++) {
            int k = (int) (Math.random() * 899+100);

          //sjekker om tallet finnes i loopen
            if (sjekkTall(k,i)){
                array[i] = k;


            }
        }
    }

    //returnerer false hvis tallet finnes i loopen
    private boolean sjekkTall(int k, int i) {
        for(int t =0;t< i ;t++) {
            if (array[t] == k){
                return false;
            }
        }
    }

    public static void main(String[] args) {
        UnikeTall tall = new UnikeTall(5);


//metode for å skrive ut tilfeldig tall
        tall.tilfeldigTall();
        for (int j = 0; j < tall.array.length; j++) {
            System.out.println(tall.array[j]);



        }
    }

   }



   /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

    // Metode som finner og returnerer det minste tallet i arrayet.

    // Metode som finner og returnerer det største tallet i arrayet.

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */


