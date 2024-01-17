package exam2022;

class List{
    public int positiv(int[]liste){
        int teller=0;
        for(int i:liste) {
            if (i > 0) {
                teller++;

        }
    }
        return teller;
}
public static int antallTall(int[]liste,int tall){
        tall=0;
        for(int i:liste){
            if(i==tall){
                tall++;
            }
        }
        return tall;
    }

public static int storst(int[]liste){
        int størst=liste[0];
        for(int i:liste){
            if(i>størst){
                størst+=i;
            }
        }
        return størst;
    }
}

public class åppgave2 {
    public static void main(String[]args){
int[]liste={1,2,3,4,3,6};
        System.out.println("Positive tall i lista er "+Liste.positive(liste));
        System.out.println("3 kommer "+Liste.antallTall(liste,3));
        System.out.println("Største tallet i lista er "+Liste.størst(liste));
    }
}
