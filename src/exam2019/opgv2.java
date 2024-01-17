package exam2019;

import java.util.Arrays;

class tRekning{

    public int[] vinnere(){
        int[]vinnere=new int[7];
        int i=0;
        while(i<7){

            int random=(int)(Math.random()*34+1);

            boolean funnet = false;
            for (int j = 0; j < 7; j++) {
                if (vinnere[j] == random) {
                    funnet = true;
                }
            }
            if (!funnet) {
                vinnere[i] = random;
                i++;
            }
        }
        Arrays.sort(vinnere);
        return vinnere;
        }
    }

public class opgv2 {
    public static void main(String[]args){

        tRekning T=new tRekning();
        int[]vinnere=T.vinnere();
        for(int v: vinnere){
            System.out.println("Vinnerene er "+v);
        }
    }
}
