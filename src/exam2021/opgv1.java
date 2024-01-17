package exam2021;

public class opgv1 {
    public static void main(String[] args) {
        //for løkke som skriver ut hvert 5. tall mellom 5 og 100
        for (int i = 5; i <= 100; i += 5) {
            System.out.print(i + " ");
        }
        //while løkke som skriver ut hvert 5. tall mellom 5 og 100
        System.out.println();
        int i = 0;
        while (i < 100) {
            i += 5;
            System.out.print(i+" ");
        }
    }

}
