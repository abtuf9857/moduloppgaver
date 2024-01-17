package kontexam2019;
/*a) Skriv kode som summerer alle heltallene mellom 100 og 200 (inklusive tallene) og skriver ut
summen på System.out. Bruk en for-løkke.
b) Skriv kode som skriver ut hvert tredje tall fra 100 (inklusive tallet) og opp tll 200 på System.out. Bruk
en while-løkke.
Skriv ditt svar her.. */
public class Oppgave1 {
    //Oppgave 1a
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            sum += i;
        }
        System.out.println("Summen av tallene er : "+sum);

//Oppgave b
    int teller=100;
    while(teller<=200) {
        System.out.println(teller);
        teller += 3;
    }

    }
}
