package kontexam2021;

public class åppgave1 {
    public static void main(String[] args) {
        //skriver ut hele lista med mellomrom
        int[] liste = {20, 34, -4, 4, 5, 11, -23};
        for (int i : liste) {
            System.out.print(i + " ");
        }
        //skriver ut hele lista baklengs
        System.out.println();
        for (int i = liste.length - 1; i > 0; i--) {
            System.out.print(liste[i] + " ");
        }
        //skriver ut summen av alle tallene i lista
        System.out.println();
        int sum = 0;
        for (int i : liste) {
            sum += i;
        }
        System.out.print("summen er " + sum);
//skriver ut gjennomsnittet av alle tallene i lista
        System.out.println();
        double gjennomsnitt = (double) sum / liste.length;
        System.out.println("Gjennomsnittet er " + gjennomsnitt);
//skriver ut alle tall i lista mellom 0 og 20
        for (int i : liste) {
            if (i > 0 && i < 20) {
                System.out.println(i);
            }
        }
    }

}