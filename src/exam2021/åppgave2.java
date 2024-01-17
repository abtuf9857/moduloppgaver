package exam2021;
public class åppgave2 {
    public static boolean funnetTall(int[] liste, int tall) {
        for (int x : liste) {
            if (x == tall) {

                return true;

            }
        }
        return false;
    }


    public static void main(String[]args) {
        int[] liste = new int[10];
        liste[0]=1;
        liste[1]=2;
        boolean funnet = funnetTall(liste, 2);
        if (funnet) {
            System.out.println("funnet");
        }
        else{
            System.out.println("ikke funnet");
        }
    }}





