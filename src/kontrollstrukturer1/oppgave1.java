/*Les inn en heltallsvariabel. Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol
 med mer enn 22 % på polet”. Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20.
 Dersom dette ikke er tilfelle skriv ut ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.

 */
package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
public class oppgave1 {
    public static void main(String[]args){
        String input= JOptionPane.showInputDialog("Fyll inn alderen din");
        int alder= Integer.parseInt(input);

        if (alder>=20 || alder < 18 ){
            showMessageDialog(null,"Du er enten umyndig eller så kan du kjøpe hva du vil på polet");
        }
        else if (alder>=18){
            showMessageDialog(null," Du er myndig men kan ikke kjøpe alkohol med mer enn 22% på polet");
        }
    }
}
