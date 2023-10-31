/*Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2
parametere hver. Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og
dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.

 */
package klasserogobjekter1;

//klasse med de fire regneoperasjonene
class Kalkulator {

    //metode for å addere to desimaltall
    public static double addere(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum;
    }

    //metode for å subtrahere to desimaltall
    public static double subtrahere(double tall1, double tall2) {
        double sum = tall1 - tall2;
        return sum;
    }

    //metode for å multiplisere to desimaltall
    public static double multiplisere(double tall1, double tall2) {
        double sum = tall1 * tall2;
        return sum;
    }

    //metode for å dividere to desimaltall
    public static double dividere (double tall1,double tall2){
        double sum= tall1 / tall2;
        return sum;
    }
}

//testing av om metodene fungerer
public class Opgv5 {
    public static void main(String[]args) {
        System.out.println(" 2+2 er " + Kalkulator.addere(2, 2));
        System.out.println(" 2-2 er " + Kalkulator.subtrahere(2, 2));
        System.out.println(" 2*2 er "+Kalkulator.multiplisere(2,2));
        System.out.println(" 2/2 er "+Kalkulator.dividere(2,2));

    }
}
