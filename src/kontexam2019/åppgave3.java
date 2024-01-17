package kontexam2019;

class temperatur {
    public static double gjennomsnitt(double[] liste) {
        int sum = 0;
        for (int i = 0; i < liste.length; i++) {
            sum += liste[i];
        }
        return sum / liste.length;

    }

    public static double minimum(double[] liste) {
        double minimum = liste[0];
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] < minimum) {
                minimum = liste[i];
            }
        }
        return minimum;
    }
}
public class åppgave3 {
    public static void main(String[]ars){
        double[]liste={-0.4,-2.9,2.8,-3.8,1.6,-2.4,-0.9,-2.2,0.5,-4.0};
        System.out.println("gjennomsnittstemperaturen er "+temperatur.gjennomsnitt(liste));
        System.out.println("Minimumstemperaturen er "+temperatur.minimum(liste));

            }
        }

