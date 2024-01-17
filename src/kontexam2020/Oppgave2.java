/*Lag en klasse kalt KonverterTemperatur. Denne klassen skal inneholde to statiske metoder kalt
tilCelsius og tilFahrenheiht. Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden og motsatt i
den andre. Metodene skal motta og returnere et desimal tall.
Formelene for konverteringene er:
C = (F - 32) / 1.8
F = C * 1.8 + 32
*/



package kontexam2020;

class KonverterTemperatur{
    public static double tilCelsius(double fahrenheit){
        double celsius=fahrenheit-32/1.8;
        return celsius;
    }
    public static double tilFahrenheit(double celsius){
        double Fahrenheit=celsius*1.8+32;
        return Fahrenheit;
    }
}
public class Oppgave2 {
    public static void main(String []args){
        double celsius=23.5;
        System.out.println(celsius+" blir "+KonverterTemperatur.tilFahrenheit(celsius)+"F");

        double fahrenheit=100.5;
        System.out.println(fahrenheit+" blir "+KonverterTemperatur.tilCelsius(fahrenheit)+"C");

    }


}
