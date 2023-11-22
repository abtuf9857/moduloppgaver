package exam2018;
/*Skriv kode for å skrive ut alle tallene fra 1 til 25 (begge inkludert) på hver sin linje. Bruk
        System.out.println()
        a) Bruk en while-løkke for å få utskriften.
        b) Bruk en for-løkke for å få utskriften.*/
public class Oppgave1 {

    public static void main(String[] args){
        //FOR LØKKEN
        for(int teller=1; teller<26;teller++){

            System.out.println(teller);
        }
        //WHILE LØKKEN
        int teller=1;
        while(teller<26){
            System.out.println(teller);
            teller++;
        }
    }
}
