package kontrollstrukturer2;

public class Oppgave8 {
    public static void main(String []args){
        int sum=0;
        int teller=0;
        int i=0;
        while (i < 100) {
            sum+=i;
            i+=2;
            teller++;
        }
        System.out.println(" Summen av alle partallene mellom 0 og 100 er "+sum);
        double gjennomsnitt=(double)sum/(double)teller;
        System.out.println(" Gjennomsnittet av alle partallene mellom 0 og 100 er "+gjennomsnitt);
    }
}
