package exam2021;

import java.util.ArrayList;
import java.util.Collections;

class sTørstogMinst{
    public int størst(ArrayList<Integer>lista){
        Collections.sort(lista);
        return lista.get(lista.size()-1);
    }
    public int minst(ArrayList<Integer>lista){
        Collections.sort(lista);
        return lista.get(0);
    }
}
public class opgv3 {
    public static void main(String[]args){
        sTørstogMinst finn=new sTørstogMinst();
        ArrayList<Integer>lista=new ArrayList<>();
        lista.add(0);
        lista.add(300);
        lista.add(-299);
        lista.add(50);
        System.out.println(finn.størst(lista));
        System.out.println(finn.minst(lista));

    }
}
