package kontexam2020;/*Gitt dette heltallsarrayet:
        int [] liste = {1,3,6,2,7,10,23,6,3,6};
        a) Skriv ut arrayet på System.out med mellomrom mellom. Bruk en foreach-løkke.
        b) Skriv ut arrayet på System.out baklengs med mellomrom mellom (6 3 6 23 10 7 2 6 3 1). Bruk en for-løkke.
        c) Regn ut gjennomsnittet av tallene i arrayet og skriv resultatet på System.out. Bruk en while-løkke.
        Skriv ditt svar her...  */


public class Oppgave1 {
    public static void main(String[]args) {
        //Oppgave a)
        int[] liste = {1, 3, 6, 2, 7, 10, 23, 6, 3, 6};
        for (int te : liste) {
            System.out.print(te + " ");
        }
        //oppgave b
        System.out.println();
        for (int et = liste.length - 1; et > 0; et--) {
            System.out.print(liste[et] + " ");
        }
        //Oppgave c
        int sum = 0;
        int teller = 0;
        while (teller < liste.length) {
            sum += liste[teller];
            teller++;
        }

        double gjennomsnitt = (double) sum / teller;
        System.out.println("gjennomsnittet er : " + gjennomsnitt);
    }

}