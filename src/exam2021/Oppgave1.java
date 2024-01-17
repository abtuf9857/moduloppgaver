package exam2021;


public class Oppgave1 {
    public static void main(String[] args) {
        /* Oppgave a Skriv kode for å summere hvert 5 tall fra og med 5 til og med 100. Det skal brukes en for-løkke.
Resultatet skal skrives ut på System.out. Skriv kode for å finne gjennomsnittet også.*/
        int sum = 0;
        double snitt = 0;
        int teller = 0;
        for (int i = 5; i < 100; i += 5) {
            i += 5;
            sum += i;
            teller++;
            System.out.println(i);
        }

        double gjennomsnitt = (double) sum / (double) teller;
        System.out.println("gjennomsnittet er : " + gjennomsnitt);

        //b) Skriv tilsvarende kode som over med bruk av en while-løkke.

        sum = 0;
        snitt = 0;
        teller = 0;
        int teller1 = 5;
        while (teller1 <= 100) {
            sum += teller1;
            teller++;
            teller1 += 5;
        }
        System.out.println("Summen er : " + sum);
        snitt = (double) sum / teller;
        System.out.println("Gjennomsnittet er : " + snitt);
    }
}

