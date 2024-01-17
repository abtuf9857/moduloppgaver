package kontexam2019;
/*Gitt et array med følgende gjennomsnittstemperaturer for januar de siste 10 årene for Oslo:
-0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0. Det kan velges om man ønsker å implementere
med et array eller en array-list.
Lag en klasse kalt Temperatur. Lag statiske metoder for
a) Regne ut gjennomsnittstemperaturen arrayet. Metoden (kalt gjennomsnitt) skal ta arrayet inn og
returnere gjennomsnittet. Det skal brukes en løkke.
b) Finne minimumstemperaturen. Metoden (kalt minimum) skal ta arrayet inn og returnere den minste
verdien i arrayet. Det skal brukes en løkke for å finne verdien.
c) Skriv så kode for å opprette arrayet, kalle metodene og skrive ut resultatet i System.out.*/
class Temperatur {
    public static double gjennomsnitt(double[] liste) {
        int sum = 0;
        for (int i = 0; i < liste.length; i++) {
            sum += liste[i];
        }
        return sum / liste.length;

    }

    public static double minimum(double[] liste) {
        double minimum = liste[0];
        for (int i = 1; i < liste.length; i++) {
            if (liste[i] < minimum) {
                minimum = liste[i];
            }
        }
        return minimum;
    }
}
    public class Oppgave3 {
        public static void main(String[] args) {
            double[] liste = {-0.4, -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0};
            System.out.println("Gjennomsnittstemperaturen er : " + Temperatur.gjennomsnitt(liste));
            System.out.println("Minimumstemperaturen er : " + Temperatur.minimum(liste));
        }
    }




