package exam2018;

/* Lag en klasse kalt Liste for å behandle arrays.
Lag følgende statiske metoder i denne klassen som behandler arrays:
1) Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
2) Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal også
inn i metoden)
3) Tar et heltallsarray inn og finner det største tallet i arrayet
Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
Resultatet skal skrives ut på System.out.
Kode for main:
public static void main(String[] args) {
}
Skriv ditt svar her...
1
 */
class Liste{

    //Oppgave A
    //for løkke som tar inn et heltalls array og returnerer elementer som er mer enn 0
    public static int positiv(int []liste) {
        int teller = 0;
        for (int i : liste) {
            if (i > 0) {
                teller++;
            }

        }

        return teller;
    }
    //Oppgave B
    //For løkke som tar inn et heltallsarray og finner ut hvor mange ganger tallet kommer, tallet er også
    // inne i metoden
    public static int antallTall(int[]liste,int tall){
        int teller=0;
        for(int i:liste){
            if(i==tall){
                teller++;
            }
        }
    return teller;
}

//Oppgave C
//For løkke som tar inn heltallsarrayet og finner det største tallet
public static int størst(int []liste){
    int størst=liste [0];
    for(int i:liste){
        if (i>størst){
            størst=i;
        }
    }
    return størst;
    }

}

public class Oppgave3 {
    public static void main(String[]args){
        int []liste={0,2,3,7,2,8,9};
        System.out.print("Antall positive tall i lista er : "+Liste.positiv(liste)+"\n");
        System.out.print("Antall toere i lista er :  "+Liste.antallTall(liste,2)+"\n");
        System.out.print("Det største tallet i lista er : "+Liste.størst(liste));


    }
}
