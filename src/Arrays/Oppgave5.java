package Arrays;

public class Oppgave5 {
    public static void main(String[] args) {
        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int største = liste[0];
        int minste = liste [0];
        for (int i : liste) {
            if (i > største) {
                største = i;
            }
            if (i < minste) {
                minste = i;
            }
            }
            System.out.println("Det største tallet er " + største);
            System.out.println("Det minste tallet er " + minste);
        }

    }
