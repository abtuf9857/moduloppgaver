package kontexam2020;

public class åppgave1 {
    public static void main(String[]args){
        //skrive ut arrayet med for each
        int[]liste={1,3,6,2,7,10,23,6,3,6};
        for(int t:liste){
            System.out.print(t+" ");
        }
        System.out.println();
        //skrive ut arrayet baklengs
        for( int t =liste.length-1; t>0;t--){
            System.out.print(liste[t]+" ");
        }
        int sum=0;
        int teller=0;
        while(teller<liste.length){
            sum+=liste[teller];
            teller++;

        }
        System.out.println();
        double gjennomsitt=(double) sum/teller;
        System.out.print("Gjennomsnittet er "+gjennomsitt);
    }
}
