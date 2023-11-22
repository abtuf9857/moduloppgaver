package exam2020;
/*et skal lages en enkel løsning med inputbokser og meldingboks for å konvertere fra celcius grader (C)
til fahrenheit (F) og motsatt.
Løsningen skal gjøre følgende :
Lese inn en streng fra en inputdialogboks hvor det skal oppgis hva det skal konverteres FRA (C eller F
skal skrives inn)
Lese så inn gradene fra en ny inputdialogboks
Konvertere gradene til en double
Avhengig av hva som er skrevet inn i den første inputboksen regne ut resultatet via følgende formler:
Fra Celcius til Fahrenheit: F = C * 1.8 + 32
fra Fahrenheit til Celcius: C = (F - 32) / 1.8
Skriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldingsboks.
Dersom det ikke er skrevet inn hverken C eller F i den første inputboksen skal det ikke regnes ut noe, men
skrives ut i meldingsboksen at det må skrives inn enten C eller F.
Maks poeng: 25
1
 */

import java.util.Objects;

import static javax.swing.JOptionPane.*;
public class Oppgave1 {
public static void main(String []args) {
    String celsiusellerfahrenheit = showInputDialog("Skriv C eller F : ");
    String tilfeldigTall = showInputDialog("Skriv inn grader : ");

    if (Objects.equals(celsiusellerfahrenheit, "F")) {
        double celsiusGrader = Double.parseDouble(tilfeldigTall);
        double FahrenheitIgrader = (celsiusGrader * 1.8) + 32;
        String FahrenheitgraderMedToDesimaler = String.format("%.2f", FahrenheitIgrader);
        showMessageDialog(null, "Er " + FahrenheitgraderMedToDesimaler + " Fahrenheitgrader");

    }
    if (Objects.equals(celsiusellerfahrenheit, "C")) {
        double Fahrenheitgrader = Double.parseDouble(tilfeldigTall);
        double Celsiusgrader = (Fahrenheitgrader - 32) / 1.8;
        String CelsiusgraderMedToDesimaler = String.format("%.2f", Celsiusgrader);


        showMessageDialog(null, "Er " + CelsiusgraderMedToDesimaler + " Celsiusgrader");
    } else showMessageDialog(null, "Det må skrives inn F eller C");
}
    }




