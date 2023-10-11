package klasserogobjekter2;

import java.sql.SQLOutput;

class Klokke {
    private int timer;
    private int minutter;
    private int sekunder;

    

    public Klokke (int timer, int minutter, int sekunder){
        setTimer(timer);
        setMinutter(minutter);
        setSekunder(sekunder);

    }
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
   public void visTiden(){
       System.out.println(timer+" : "+minutter+" : "+sekunder+" : ");
   }
}
public class oppgave4{
    public static void main(String[]args){
     Klokke tid1= new Klokke(12,45,01);
     tid1.visTiden();
     Klokke tid2= new Klokke (11,34,67);
     tid2.visTiden();
    }

}

