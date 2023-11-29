package exam2022;
/*Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut. */
public class Oppgave1 {

    int []liste= {-3,41,5,-3,2,49};
    int teller=0;
    for(int i: liste){
        if(i>10){
            teller++;
        }
    }
}
