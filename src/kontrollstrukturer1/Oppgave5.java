/*Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er.
Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch.

 */
package kontrollstrukturer1;

import static javax.swing.JOptionPane.*;
public class Oppgave5 {
    public static void main(String[] args) {
        String måned = showInputDialog("Skriv inn måned");
        if (måned.equals("Juni") || måned.equals("Juli") || måned.equals("August")){
        showMessageDialog(null, "Det er sommer ");
    }
    else if (måned.equals("September")||måned.equals("Oktober")||måned.equals("November")){
        showMessageDialog(null,"Det er høst");
        }

else if (måned.equals("Desember")||måned.equals("Januar")||måned.equals("Februar")){
            showMessageDialog(null, "Det er vinter");
        }
else if (måned.equals("Mars")||måned.equals("April")||måned.equals("Mai")){
    showMessageDialog(null,"Det er vår");
        }
else{
    showMessageDialog(null,"Det er ikke en måned i vår kalender");
        }

        }
}





