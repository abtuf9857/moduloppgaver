package kontrollstrukturer1;

import static javax.swing.JOptionPane.*;
public class Oppgave5b {
    public static void main(String[]args){
        String måned=showInputDialog("Skriv inn en måned");
        switch (måned){
            case "Juni":
            case "Juli":
            case "August":
                showMessageDialog(null,"Det er sommer");
                break;
            case "September":
            case "Oktober":
            case "November":
                showMessageDialog(null,"Det er høst");
                break;
            case "Januar":
            case "Februar":
            case "Desember":
                showMessageDialog(null,"Det er vinter");
                break;
            case "Mars":
            case "April":
            case "Mai":
                showMessageDialog(null,"Det er vår");
                break;
            default:showMessageDialog(null,"Det er ikke en måned i vår kalender");
            break;

        }
    }

}
