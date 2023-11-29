package exam2021;

import java.util.ArrayList;
import java.util.Collections;

public class Oppgave3 {
    public static void main(String[] args) {
        finnStorstogMinst finn = new finnStorstogMinst();
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(12);
        liste.add(14);
        liste.add(7);
        System.out.println("Største er : " + finn.storst(liste));
        System.out.println("Minste er : " + finn.minst(liste));
    }

}

class finnStorstogMinst {
    public int storst(ArrayList<Integer> innListe) {
        Collections.sort(innListe);
        return innListe.get(innListe.size() - 1);
    }

    public int minst(ArrayList<Integer> innListe) {
        Collections.sort(innListe);
        return innListe.get(0);
    }
}


