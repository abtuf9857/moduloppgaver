package Arrays;

public class Oppgave2 {
public static void main (String[]args){
    int[]liste={1,2,3,4,5,6,7,8,9};
    int sum=0;
    for (int i=0;i<liste.length;i++){
        sum+=liste[i];
    }
    System.out.println("Summen av lister er "+sum);
    double gjennomsnitt=(double)sum/ liste.length;
    System.out.print("Gjennomsnittet av de samme tallene er "+gjennomsnitt+" ");

sum=0;
int teller=0;
for(int i : liste){
    if (i > 5) {
        sum += i;
        teller++;
    }
    }
    System.out.println("Summen av lister er " + sum);
    gjennomsnitt = (double) sum / teller;
    System.out.print("Gjennomsnittet av de samme tallene er " + gjennomsnitt);

    }

}

