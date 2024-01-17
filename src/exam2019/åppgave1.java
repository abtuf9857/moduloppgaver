package exam2019;

public class åppgave1 {
    public static void main(String[]args) {
        //opppgave a hvert tredje tall mellom 0 og 100
        for (int i = 0; i <= 100; i += 3) {
            System.out.print(i + " ");
        }
        int tall = 0;
        int sum = 0;
        while (sum < 100) {
            sum += 2;
            tall++;
            System.out.print(sum + " "+"\n");
        }
//gjennomsnittet av alle partall mellom 2 og 100
        double gjennomsnitt = (double) sum / tall;
        System.out.print("gjennomsnittet er " + tall);
    }
}
