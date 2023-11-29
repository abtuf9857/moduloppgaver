package exam2021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Oppgave2 {
    public static boolean funnetTall(int[] innListe, int tall) {
        for (int x : innListe) {
            if (x == tall) {
                return true;
            }
        }
        return false;
    }

    //oppgave 3
    /*Det skal lages en klasse med to metoder kalt "storst" og "minst". Disse metodene skal ta inn en
ArrayListe av heltall og returnere henholdsvis det største og minste tallet.
Lag så en "main" metode som gjør følgende:
Instansierer den nevnte klassen over
Oppretter en liste av heltall
Legger inn noen heltall i listen
Skriver ut på System.out det største og minste tallet i listen ved hjelp av kallet til de to
metodene. */
    public static void main(String[] args) {
        int[] liste = new int[10];
        liste[0] = 2;
        liste[1] = 3;
        liste[2] = 4;
        boolean funnet = funnetTall(liste, 1);
        if (funnet) {
            System.out.println("Funnet");
        } else {
            System.out.println("Ikke funnet");
        }
    }
}
