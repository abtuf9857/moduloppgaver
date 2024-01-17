package kontexam2022;
/*a) Skriv kode for å summere hvert 10. tall fra 0 til 1000, dvs. 10,20,30 .... 990, 1000 ved hjelp av en for-løkke.
Skriv ut resultatet på System.out.
b) Gjør det samme som i oppgave a) men med en while-løkke.
c) Skriv på System.out alle tallene fra 10 til -10 i rekkefølge med en for-løkke med komma i mellom (10, 9, 8, ....
-9,-10). Merk : ikke komma etter siste tallet -10.*/

public class Oppgave1 {
    public static void main(String[]args) {
        //a. for løkke som viser hvert tiende tall fra 0 til og med 1000
        for (int i = -1; i < 1000; i += 9) {
            i++;
            System.out.print(i + ", "+"\n");
        }
        //b. while løkke som viser hvert tiende tall fra 0 til og med 1000
        int j = 0;
        while (j < 1000) {
            j += 10;


            System.out.print(j + ", "+"\n");

        }
        //for løkke som viser alle tall mellom 10 og -10
        for (int i = 10; i >= -10; i--) {
            if (i == -10)
            {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }}
