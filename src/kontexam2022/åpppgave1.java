package kontexam2022;

public class åpppgave1 {
    public static void main(String[] args) {
        //Skriver ut hvert tiende tall mellom 0 og 1000 med en for løkke
        for (int i = 0; i < 1000; i += 10) {
            System.out.print(i + " ");
        }
        //skriver ut hvert tiende tall mellom 0 1000 med en while løkke
        System.out.println();
        int i = 0;
        while (i < 1000) {
            i += 10;
            System.out.print(i + " ");

        }
//skriver ut alle tall mellom 10 og -9 med komma
        System.out.println();
        for (int j = 10; j >= -10; j--) {
            if (j > -10) {
                System.out.print(j + ", ");
                //skriver ut -10 uten komma
            } else {
                System.out.print(j);
            }
        }
    }
}



