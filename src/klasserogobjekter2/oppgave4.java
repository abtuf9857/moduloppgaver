/*Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time,
minutter og sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende
format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.

 */

package klasserogobjekter2;

import java.sql.SQLOutput;

//klasse med fire private attributter som alle er heltall
class Klokke {
    private int timer;
    private int minutter;
    private int sekunder;

    
//konstruktør av klassen Klokke
    public Klokke (int timer, int minutter, int sekunder){
        setTimer(timer);
        setMinutter(minutter);
        setSekunder(sekunder);

    }
    //Get Set metoder for alle attributtene i klassen klokke
    public int getTimer() {
        return timer;
    }

    public void setTimer(int time) {
        if(timer>=0 && timer <=24){
        this.timer = time;
            }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if (minutter>=0 && minutter<=59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if (sekunder>=0 && sekunder<=59){
        this.sekunder = sekunder;
        }
    }

    //metode som sier hvordan tiden skal vises i timer,minutter og sekunder
   public void visTiden(){
       System.out.println(timer+" : "+minutter+" : "+sekunder+" : ");
   }
}

//main metode som skal kjøre programmet og vise tiden
public class oppgave4{
    public static void main(String[]args){
     //Dette er ett klokkeslett
        Klokke tid1= new Klokke(12,45,01);
     tid1.visTiden();
     //Dette er et annet klokkeslett
        Klokke tid2= new Klokke (11,34,67);
        tid2.visTiden();
    }

}

