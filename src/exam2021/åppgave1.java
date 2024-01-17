package exam2021;

public class åppgave1 {
    public static void main(String[] args) {
        int sum = 0;
        double snitt = 0;
        int teller = 0;
        for (int i = 5; i <= 100; i += 5) {
            i += 5;
            sum += i;
            teller++;
            System.out.println(i);
        }
        double gjennomsnitt = (double) sum / (double) teller;
        System.out.println("gjennomsnittet er " + gjennomsnitt);

        sum=0;
        snitt=0;
        teller=0;
        int teller1=5;
        while(teller1<100){
            sum+=teller1;
            teller++;
            teller1+=5;
        }
        System.out.println("summen er "+sum);
        snitt=(double)sum/teller;
        System.out.println("gjennomsnittet er "+snitt);
    }
}

