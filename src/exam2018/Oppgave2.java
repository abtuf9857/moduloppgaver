package exam2018;
/*Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å :

a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.
Skriv ditt svar her...
Maks poeng: 20
 */

public class Oppgave2 {
    public static void main(String []args) {
//array med tall
        int [] Liste = {-3,41,5,-3,2,49};

        //oppgave A
//metode for å telle antall tall som er mer enn 10
        int Teller = 0;
        for (int i : Liste){
            if (i > 10){
                Teller++;
            }
        }
        //her skrives antallet ut
        System.out.print("Antall tall større enn 10 er "+Teller+"\n");

        //oppgave B
        //for løkke som skriver ut annethvert tall fordi lista øker med to

        for(int i = 0; i < Liste.length; i+=2){
            System.out.print(Liste [i]+" ");
        }
        //for løkke som skriver ut alle positive tall i arrayet
        int Sum = 0;
        Teller = 0;
        for (int i : Liste){
            if (i > 0){
                Sum+= i;
                Teller++;
            }
        }
        //alle positive tall skrives ut i tillegg til at gjennomsnitt regnes ut og skrives ut
        System.out.print("Summene av alle positive tall er "+Sum+"\n");
        double Gjennomsnitt = (double) Sum / Teller;
        System.out.print("Gjennomsnittet av alle heltallene er "+Gjennomsnitt);
    }


}