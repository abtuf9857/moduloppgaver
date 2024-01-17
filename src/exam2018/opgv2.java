package exam2018;

public class opgv2 {
    public static void main(String[] args) {
        int[] liste = {-3, 41, 5, -3, 2, 49};
        //metode som regner ut antall tall større enn 10
        int t = 0;
        for (int i : liste) {
            if (i > 10) {
                t++;
            }
        }
        System.out.println("Antall tall større enn 10 er " + t);
//metode som skriver ut alle tall beklengs
        System.out.println();
        for (int i = 0; i < liste.length; i += 2) {
            System.out.print(liste[i] + " ");
        }
        //metode som regner ut sum av alle positive tall i arrayet
        System.out.println();
        int sum = 0;
        int teller = 0;
        for (int i : liste) {
            if (i > 0) {
                sum += i;
                teller++;
            }
        }
        System.out.print("Summen av alle positive tall i lista er " + sum);

        System.out.println();
        double gjennomsnitt = (double) sum / teller;
        System.out.print("Gjennomsnittet av alle postive tall i lista er " + gjennomsnitt);

    }
}
