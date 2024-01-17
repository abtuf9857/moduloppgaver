package exam2019;

public class opgv1 {
    public static void main(String[]args){
        //for løkke som skriver hvert tredje tall mellom 0 og 100
        for(int i=0; i<100;i+=3){
            System.out.print(i+" ");

        }
        //while løkke som først summerer alle partall mellom 2 og 100 også finner gjennomsnittet
        System.out.println();
        int i=2;
        int teller=0;
        int sum=0;
        while(i<=100){
            i+=2;
            sum+=i;
            teller++;
        }
        double gjennomsnitt=(double)sum/teller;
        System.out.println("Gjennomsnittet er "+gjennomsnitt);

    }


}
