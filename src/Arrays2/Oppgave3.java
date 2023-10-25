//Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
//Skriv kode for å konvertere dette til et ArrayList. Skriv så ut denne ArrayL

package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;


public class Oppgave3 {
    public static void main(String[] args) {

        //Arrayet
        int[] liste = new int[9];
        int[] liste2 = {1, 2, 3, 4, 5, 6, 7, 8,9,};

        //ArrayListen
        ArrayList<Integer> listee = new ArrayList<>();
        ArrayList<Integer> listee2 = new ArrayList<>();

        //Konverteringen av Arrayet til Arraylisten
        for (int i : liste2){
            listee2.add(i);
        }

        System.out.println(listee2);

    }
    //Alternativ metode å skrive ut
//ArrayList<Integer> listee = new ArrayList<>(Arrays.asList(Arrays.stream(liste).boxed().toArray(Integer[]::new)));
}



