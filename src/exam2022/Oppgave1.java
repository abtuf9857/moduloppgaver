package exam2022;
/*Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut. */
public class Oppgave1 {
public static void main(String[]args) {

    //Oppgave a)
    int[] liste = {-3, 41, 5, -3, 2, 49};
    int teller = 0;
    for (int i : liste) {
        if (i > 10) {
            teller++;
        }
    }
    System.out.println("Antall tall større enn 10 er " + teller);

    //oppgave b

for(int i=0; i <liste.length;i+=2){
    System.out.println(liste[i]+"");
}
//c og d
int sum=0;
teller=0;
for(int i:liste){
if(i>sum){
    sum+=i;
    teller++;
}
}
    System.out.println("Summen av alle heltallene er : "+sum);
double gjennomsnitt=(double) sum/teller;
    System.out.println("Gjennomsnittet av alle heltallene er : "+gjennomsnitt);
}
}
/*public static void main(String[] args) {
        int[] liste = {-3, 41, 5, -3, 2, 49};
        int teller = 0;
        for (int i : liste) {
            if (i > 10) {
                teller++;

            }

        }
        System.out.println("Antall tall større enn 10 er " + teller);

        for (int i = 0; i < liste.length; i += 2) {
            System.out.print(liste[i]+" ");
        }

        teller = 0;
        int sum = 0;
        for (int i : liste) {
            if (i > 0) {
                sum += i;
                teller++;
            }
            System.out.println("Summen av alle heltallene er "+sum);
            double gjennomsnitt = (double) sum / teller;
            System.out.println("Gjennomsnitt av positive tall er "+gjennomsnitt);
        }
    }
} */