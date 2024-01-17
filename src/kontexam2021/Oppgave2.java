package kontexam2021;
/*Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
dialogbokser og meldingsboks fra Swing-bibliotektet.
Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
Så skal BMI'en regnes ut med følgende formel:
( 1,3 * vekt) / ( høyde/100)^ 2,5 )
^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntalllet og b eksponenten.
Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
isteden for beregningen.*/

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[]args){
        try {
            String vekt = showInputDialog("Skriv inn vekt i kg");
            String høyde = showInputDialog("Skriv inn høyde i cm");
            Double vekt1 = Double.parseDouble(vekt);
            Double høyde1 = Double.parseDouble(høyde);
            double bmi = ((1.3 * vekt1) / Math.pow((høyde1 / 100),2.5));
            showMessageDialog(null, "BMI er : " + bmi);

        }
        catch(Exception e){
        System.out.println("Du skrev ikke inn vekt eller høyde i tall, prøv igjen");
    }
}}
