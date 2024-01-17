package exam2020;

import java.util.Objects;

import static javax.swing.JOptionPane.*;

public class åppgave1 {
    public static void main(String[] args) {
        String celsiusellerfahrenit = showInputDialog("Skriv C eller F");
        String tilfeldiggrad = showInputDialog("Skriv inn grader");

        if (Objects.equals(celsiusellerfahrenit, "F")) {
            double celsiusgrader = Double.parseDouble(tilfeldiggrad);
            double FahrenheitIgrader = (celsiusgrader * 1.8) + 32;
            String FahrenheitIgraderMedtoDesimaler = String.format("%.2f", FahrenheitIgrader);
            showMessageDialog(null, "er" + FahrenheitIgraderMedtoDesimaler + "Fahrenheitgrader");
        }
            if (Objects.equals(celsiusellerfahrenit, "C")) {
                double fahrenheitgrader = Double.parseDouble(tilfeldiggrad);
                double CelsiusIgrader = (fahrenheitgrader - 32) / 1.8;
                String CelsiusIgraderMedToDesimaler = String.format("%.2f", CelsiusIgrader);
                showMessageDialog(null, "er" + CelsiusIgraderMedToDesimaler + "Celsiusgrader");

            } else showMessageDialog(null, "Skriv inn C eller F");

        }
    }

