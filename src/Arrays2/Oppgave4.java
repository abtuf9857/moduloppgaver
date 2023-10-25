//Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
// Skriv kode for å konvertere dette til et vanlig heltalls-array.
// Skriv så kode for å skrive ut det nye heltalls-arrayet

package Arrays2;

import java.sql.Array;
import java.util.ArrayList;

public class Oppgave4 {
public static void main(String[]args){
    //Arraylisten
    ArrayList<Integer> liste=new ArrayList<Integer>();

    liste.add(1);
    liste.add(2);
    liste.add(3);
    liste.add(4);
    liste.add(5);
    liste.add(6);
    liste.add(7);
    liste.add(8);
    liste.add(9);


    //Metode for å konvertere arraylisten til et array
    Object[] Array = liste.toArray();

    //For loop som kaller på objektet(array) og skriver det ut
    for(Object array : Array)
        System.out.print(array + " ");




}


}

