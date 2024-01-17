package exam2020;

import java.util.Objects;

import static javax.swing.JOptionPane.*;

public class opgv1 {
    public static void main(String[] args) {
        String CelsiusellerFahrenheit = showInputDialog("Skriv inn C eller F");
        String grader = showInputDialog("Skriv inn grader");

        if (Objects.equals(CelsiusellerFahrenheit, "F")) {
            double celsius = Double.parseDouble(grader);
            double fahrenheit = celsius * 1.8 + 32;
            String FahrenheitMedToDesimaler = String.format("%.2f", fahrenheit);
            showMessageDialog(null, "er " + FahrenheitMedToDesimaler + " grader");
        }
            if(Objects.equals(CelsiusellerFahrenheit,"C")) {
                double Fahrenheit = Double.parseDouble(grader);
                double celsiusgrader = (Fahrenheit - 32) / 1.8;
                String celsiusgradermedTodesimaler = String.format("%.2f", celsiusgrader);
                showMessageDialog(null, "er " + celsiusgradermedTodesimaler + " grader");
            }
            else
                showMessageDialog(null,"Skriv inn C eller F");
            }

        }




