package kontexam2022;

import java.util.ArrayList;

class Valuta{
    private String valuta;
    private double kurs;

    public Valuta(String valuta, double kurs) {
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
class ValutaKalkulator{
    private ArrayList<Valuta>valutakurser=new ArrayList<>();
public ValutaKalkulator(){
    Valuta usd= new Valuta("USD",3.5);
    valutakurser.add(usd);
    Valuta nok=new Valuta("NOK",1.5);
    valutakurser.add(nok);
    Valuta eur=new Valuta("EUR",3.4);
    valutakurser.add(eur);

    }
    public double beregnKurs(String valuta){
    for(Valuta kurs:valutakurser){
        if(kurs.getValuta().equals(valuta)){
            return kurs.getKurs();
        }
    }
    return 0;

    }
}

public class Oppgave2 {
    public static void main(String[]args){
ValutaKalkulator k=new ValutaKalkulator();
        System.out.println("USD="+String.format("%2f",k.beregnKurs("USD")));
        System.out.println("NOK="+String.format("%.2f",k.beregnKurs("NOK")));
        System.out.println("Euro="+String.format("%.2f",k.beregnKurs("EURO")));

    }
}
