package kontexam2022;

import java.util.ArrayList;

class valuta{
    private String valuta;
    private double kurs;

    public valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }
}
class valutakalkulator{
    private ArrayList<valuta>valutakurser=new ArrayList<>();

    public valutakalkulator(){

    valuta kroner=new valuta("NOK",11.5);
    valuta DKkroner=new valuta("DKK",75);
    valuta dollar=new valuta("Dollar",100);

    valutakurser.add(kroner);
    valutakurser.add(DKkroner);
    valutakurser.add(dollar);
}
public double beregnKurs(String valuta){
    for(valuta nyV:valutakurser){
        if(nyV.getValuta().equals(valuta)){
            return nyV.getKurs();
        }
    }
    return 0;
    }
}



public class åpgv2 {
    public static void main(String[]args){
valutakalkulator kalkulator=new valutakalkulator();
        System.out.println("NOK ="+String.format("%.2f",kalkulator.beregnKurs("NOK")));
        System.out.println("DKK ="+String.format("%.2f",kalkulator.beregnKurs("DKK")));
        System.out.println("Dollar ="+String.format("%.2f",kalkulator.beregnKurs("Dollar")));
    }
}
