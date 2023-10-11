package klasserogobjekter2;
//Oppgave 5

import static javax.swing.JOptionPane.*;
class Konto {
    private String navn;
    private String kontonummer;
    private double saldo;

    public Konto(String navn, String kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public void utskrift() {
        String ut = " Kontoinnehaver : " + navn + "`\n" +
                "Kontonummmer : " + kontonummer + "\n" +
                "Saldo" + String.format("%.2f", saldo) + " kr";
        showMessageDialog(null, ut);
    }

    public String settInn(double beløp) {
        saldo += beløp;
        return " Den nye saldoen er " + String.format("%.2f", saldo);
        }


public String taUt(double beløp) {
    String ut = " ";
    if (beløp <= saldo) {
        saldo = saldo - beløp;
        ut = " Den nye saldoen er : " + String.format("%.2f", saldo);
    }
    else{
            ut = " Ikke dekning på konto!";
    }

    return ut;
}
}



