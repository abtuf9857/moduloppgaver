package kontexam2021;
/*Definer følgende heltalls-array : 20, 34,-4,4,5,11,-23. Lag et Java-program som ved hjelp av en
løkke for hver av deloppgavene:
1. Skriver ut tabellen med mellomrom mellom tallene
2. Skriver ut tabellen baklengs med mellomrom mellom tallene
3. Summerer tabellen
4. Finner gjennomsnittet av tallene i tabellen
5. Skriver ut tallene som er mellom 0 og 20 (ikke inkludert tallene)
Skriv ditt svar her
Maks poeng: 151
 */

public class Oppgave1 {
    public static void main(String[] args) {
        //1.Hele lista med mellomrom
        int[] liste = {20, 34, -4, 4, 5, 11, -23};
        for (int i : liste) {
            System.out.print(i + " ");
        }
        //2.Hele lista baklengs med mellomrom
        System.out.println();
        for (int i = liste.length - 1; i >= 0; i--) {
            System.out.print(liste[i] + " ");

        }
        //3.Summen av alle tallene i lista
        System.out.println();
        int sum = 0;
        for (int i : liste) {
            sum += i;
            System.out.print(i);
        }
        //4.Gjennomsnittet av alle tallene i lista
        double gjennomsnitt=(double) sum/liste.length;
        for (int i:liste){
            System.out.println(gjennomsnitt);
        }
        /* 5.Skrive ut tall i arrayet mellom 0 og 20 ikke inkludert tallene
        System.out.println();
         if(int i = liste.length&&; i=1 && <19){
             i++;
            System.out.println(i) ;*/


        }
    }

