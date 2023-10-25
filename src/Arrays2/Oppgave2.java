//Bruk samme array som i oppgave 1.Legg til tallene 10 og 11 i arrayet
//Slett så elementene med tallene 2 og 3. Skriv så ut hele arrayet med en for-løkke.
//Bruk size() for å finne lengden i arrayet.

package Arrays2;

import java.util.ArrayList;
public class Oppgave2 {
    public static void main(String[]args){
        ArrayList<Integer>liste=new ArrayList<Integer>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);
        liste.add(11);

        int indeks=liste.indexOf(2);
        liste.remove(3);

        indeks = liste.indexOf(3);
        liste.remove(4);




        for(int i=0; i<11;i++){
        }
        System.out.println(liste.size());

    }

}
