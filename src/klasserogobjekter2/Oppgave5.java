/*Nedenfor ser du en skisse av klassen Konto. Din oppgave er å erstatte skrive Javakode isteden.

// nødvendige import-setning(er)

public class Konto
{
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.

    //  Kontruktør som skal gi startverdier til ALLE attributtene

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det.

        */



package klasserogobjekter2;

import static javax.swing.JOptionPane.*;

//klasse med tre variabler
class konto{
    private String navn;
    private String kontonr;
    private double saldo;

    //kontruktør av klassen konto
   public konto(String navn, String kontonr, double saldo){
       this.navn=navn;
       this.kontonr=kontonr;
       this.saldo=saldo;
   }
   //metode for å skrive ut info om konto med en meldingsboks
   public void utSkrift(){
       String ut="Kontoinnehaver : "+navn+"\n"+
                 "Kontonummer : "+kontonr+"\n"+
                 "Saldo : "+saldo+"\n";
showMessageDialog(null,ut);

//metode for å sette inn et beløp
   }
   public String settInn(double beløp){
       saldo+=beløp;
       return "Den nye saldoen er "+String.format("%.2f",saldo);
   }

   //metode for å ta ut beløp. Beløpet må være like mye som saldoen eller mindre,
   // ellers får du en feilmelding
   public String taUt(double beløp){
       String ut="";
       if(beløp<=saldo){
           saldo=saldo - beløp;
           ut="Den nye saldoen er "+String.format("%.2f",saldo);
       }
       else {
           ut = "Ikke nok penger på konto";
       }
       return ut;
   }
    }


public class Oppgave5 {

    //main metode hvor programmet blir kjørt
    public static void main(String []args){
String kontonavn=showInputDialog("Skriv kontonavn");
String kontonummer=showInputDialog("Skriv kontonummer");
double saldo=Double.parseDouble(showInputDialog("Skriv saldo"));
konto sparekonto= new konto(kontonavn,kontonummer,saldo);
        System.out.println(sparekonto.settInn(2000));
        System.out.println(sparekonto.taUt(300));
        System.out.println(sparekonto.settInn(350));
        sparekonto.utSkrift();

    }
}
