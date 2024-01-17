package exam2022;

class KonvTemp {

    public static double tilCelsius(double innFahrenheit) {
        return (innFahrenheit - 32) / 1.8;

    }

    public static double tilFahrenheit(double inntilCelsius) {
        return (inntilCelsius * 1.8 + 32);
        }

    }
    public class åppgave4 {
    public static void main(String[]args){
        double celsius=25;
        System.out.println(KonvTemp.tilFahrenheit(celsius));
        double fahrenheit=90;
        System.out.println(KonvTemp.tilCelsius(fahrenheit));

    }
}
