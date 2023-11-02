package Oblig3;


import javax.swing.*;
import java.sql.Array;
import java.util.Scanner;

public class Oblig3 {


}

class UnikeTall {

    // Deklarasjon av array for lagring av tilfeldige heltall
    int[] array;

    /* Konstruktør som mottar arrayets lengde som parameter og
    oppretter arrayet.  */
    public UnikeTall(int myArraylengde) {
        array = new int[myArraylengde];

    }

    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

    //sjekker om tallet finnes i loopen
    public void tilfeldigTall() {
        for (int i = 0; i < array.length; i++) {
            int k = (int) (Math.random() * 900 + 100);

            while(sjekkTall( k, i)){
                k =(int)(Math.random()*900+100);
            }
            array[i] = k;


        }


    }

    // Metode som finner og returnerer det minste tallet i arrayet
    public int minsteTall() {
        int m = 899;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (m > n) {
                m = n;
            }
        }
        return m;

    }
    // Metode som finner og returnerer det største tallet i arrayet.
    public int størsteTall() {
        int m = 100;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (m < n) {
                m=n;
            }
        }
    return m;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
    (double-verdi) av tallene i arrayet.  */

    public double gjennomsnitt() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            int m = array[i];
            sum = sum + m;
        }
        return sum/array.length;
    }
    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */
    private boolean sjekkTall(int k, int i) {
        for (int t = 0; t < i; t++) {
            if (array[t] == k) {
                return true;

            }

        }
        return false;
    }


    public static void main(String[] args) {
        int myArrayLengde = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange tilfeldige tall vil du ha"));
        UnikeTall tall = new UnikeTall(myArrayLengde);


//metode for å skrive ut tilfeldig tall
        tall.tilfeldigTall();
        for (int j = 0; j < tall.array.length; j++) {
            System.out.println(tall.array[j]);


        }

        String s = String.format("Minste: %d", tall.minsteTall());
        s = "\n" + String.format("Gjsnitt: %.2f", tall.gjennomsnitt());
        JOptionPane.showMessageDialog(null, s);


    }}


   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */


