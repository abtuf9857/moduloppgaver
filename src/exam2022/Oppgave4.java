package exam2022;
/*Lag en klasse kalt KonverterTemperatur. Denne klassen skal inneholde to statiske metoder kalt
tilCelsius og tilFahrenheiht. Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden
og motsatt i den andre. Metodene skal motta og returnere et desimal tall.
Formelene for konverteringene er:
C = (F - 32) / 1.8
F = C * 1.8 + 32
Skriv så kode i main-metoden for å vise hvordan man benytter seg av klassen / metodene.
*/

        class KonverterTemperatur{

            public static double Fahrenheit(double Celsius){
                return (Celsius)*1.8+32;
            }
            public static double Celsius(double Fahrenheit){
                return (Fahrenheit-32)/1.8;
            }

        }
public class Oppgave4 {
    public static void main(String[]args){
        double celssius=28.6;
        System.out.println(celssius+" C blir "+KonverterTemperatur.Fahrenheit(celssius)+" F");
        double farenheit=100.5;
        System.out.println(farenheit+" F blir "+KonverterTemperatur.Celsius(farenheit)+" C");

    }
}
