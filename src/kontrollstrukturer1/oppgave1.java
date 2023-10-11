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
