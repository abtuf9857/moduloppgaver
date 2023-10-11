package klasserogobjekter2;

import static javax.swing.JOptionPane.showInputDialog;

public class Bank {
    public static void main(String []args){
        String kontonavn=showInputDialog(" Angi kontonavn");
        String kontonr=showInputDialog(" Angi kontonummer");
        double saldo= Double.parseDouble(showInputDialog("Angi saldo"));
        Konto sparekonto = new Konto(kontonavn, kontonr, saldo);
        System.out.println(sparekonto.settInn(2000));
        System.out.println(sparekonto.taUt(10));
        System.out.println(sparekonto.settInn(2000));
        sparekonto.utskrift();
    }
}
