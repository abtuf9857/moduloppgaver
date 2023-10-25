//Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
//Skriv ut element nummer 3 og 6 med System.out

package Arrays2;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main (String[]args){
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

        System.out.println(liste.get(2) + " " + liste.get(5));

    }
    }

