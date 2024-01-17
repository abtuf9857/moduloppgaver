package exam2018;

class liiiste{
    public static int positiv(int[]liste){
        int tall=0;
        for(int i:liste){
            if(i>0){
                tall++;
            }
        }
        return tall;
    }
    public static int antallTall(int[]liste,int tall){
        int teller=0;
        for(int i:liste){
            if(i==tall){
                teller++;
            }
        }
        return teller;
    }
    public static int størst(int[]liste){
        int størst=liste[0];
        for (int i:liste){
            if(i>størst){
                størst=i;
            }
        }
        return størst;
    }
}
public class opgv3 {
    public static void main(String[]args){
        int[]liste={1,2,3,4,4,4,4,300};
        System.out.print("Antall positive tall i arrayet er "+liiiste.positiv(liste)+"\n");
        System.out.print("Antall firere i lista er "+liiiste.antallTall(liste,4)+"\n");
        System.out.print("Det største tallet i arrayet er "+liiiste.størst(liste));

    }
}
