package exam2022;
/*Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
dialogbokser og meldingsboks fra Swing- biblioteket.
Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
Så skal BMI'en regnes ut med følgende formel:
( 1,3 * vekt) / ( høyde/100)^ 2,5 )
^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntallet og b eksponenten.
Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
isteden for beregningen.*/

import static javax.swing.JOptionPane.*;
public class Oppgave3 {
    public static void main(String[]args){
        double vekt,høyde;
        String innVekt=showInputDialog("Skriv inn vekten din i kg : ");
        String innHøyde=showInputDialog("Skriv inn høyden din i cm : ");
        try{
            vekt=Double.parseDouble(innVekt);
            høyde=Double.parseDouble(innHøyde);
        }
        catch (Exception e){
            vekt=0;
            høyde=0;
        }
        if(vekt<=0 || høyde<=0){
            showMessageDialog(null,"Går ut av programmet. Ikke gyldig input");
        }
        else{
            double BMI=(1.3*vekt)/(Math.pow(høyde/100,2.5));
            showMessageDialog(null,"BMIen din er : "+String.format("%.2f",BMI));
        }
    }

}
