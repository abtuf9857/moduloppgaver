package kontexam2020;

class konverterTemperatur{
    public static double tilCelsius(double tilFahrenheit){
        double tilCelsius=tilFahrenheit-32/1.8;
        return tilCelsius;

    }
    public static double tilFahrenheit(double tilCelsius){
        double tilFahrenheit=tilCelsius*1.8+32;
        return tilFahrenheit;
    }
}

public class åppgave2 {
    public static void main(String[]args){
        double celsius=20.5;
        System.out.println(konverterTemperatur.tilFahrenheit(celsius));
        double fahrenheit=15;
        System.out.println(konverterTemperatur.tilCelsius(fahrenheit));

    }
}
