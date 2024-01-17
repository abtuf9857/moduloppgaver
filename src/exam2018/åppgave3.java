package exam2018;

class Liiste{

    //a metode som skriver ut alle positive tall
    public static int positiv(int[]liste){
        int tall=0;
        for(int i:liste){
            if(i>0){
                tall++;
            }

        }
        return tall;
    }
//metode som finner ut hvor mange ganger et tall kommer i arrayet
public static int antallTall(int[]Liste,int tall) {
    int nummer = 0;
    for (int i : Liste) {
        if (i == tall) {
            nummer++;
        }

    }
    return nummer;
}
//metode som finn
        public static int størst(int[]Liste){
        int størst=Liste[0];
        for(int i:Liste){
            if(i>størst){
                størst=i;
            }
        }
        return størst;
    }
}
public class åppgave3 {
    public static void main(String[]args){
int[]Liste={3,4,53,3,6,7};
        System.out.println("De positive tallene i arrayet er "+Liiste.positiv(Liste));
        System.out.println("Tre kommer "+Liiste.antallTall(Liste,3));
        System.out.println("Det største tallet i arrayet er "+Liiste.størst(Liste));

    }
}
