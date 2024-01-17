package exam2021;

import java.util.ArrayList;
import java.util.Collections;

class StorstogMinst{
    public int Storst(ArrayList<Integer>liste){
        Collections.sort(liste);
        return liste.get(liste.size()-1);
    }
    public int Minst(ArrayList<Integer>liste){
        Collections.sort(liste);
        return liste.get(0);
    }
}

public class åppgave3 {
    public static void main(String[]args){
finnStorstogMinst finn=new finnStorstogMinst();
ArrayList<Integer>liste=new ArrayList<>();
liste.add(1);
liste.add(38);
liste.add(-32);
liste.add(200);
        System.out.println("Det største tallet i arraylisten er : "+finn.storst(liste));
        System.out.println("Det minste tallet i arraylisten er : "+finn.minst(liste));
    }
}
