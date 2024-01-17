package kontexam2022;

import java.util.ArrayList;


    class Valuta1 {
        private String valuta;
        private double kurs;

        public Valuta1(String valuta, double kurs) {
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

    class ValutaKalkulator1 {
        private ArrayList<Valuta1> valutakurser = new ArrayList<>();

        public ValutaKalkulator1() {
            Valuta1 dollar = new Valuta1("Dollar",10);
            valutakurser.add(dollar);
            valutakurser.add(new Valuta1("Euro", 11));
            valutakurser.add(new Valuta1("Rubler", 0.1));

        }
        public double beregnKurs(String valuta) {
            for(Valuta1 penger : valutakurser){
                if(penger.getValuta().equals(valuta)){
                    return penger.getKurs();
                }
            }
            return 0;

        }
    }

public class Oppgave22 {
    public static void main(String[] args){
        ValutaKalkulator1 kalkulator = new ValutaKalkulator1();
        System.out.println(kalkulator.beregnKurs("Dollar"));
        System.out.println(kalkulator.beregnKurs("Euro"));
        System.out.println(kalkulator.beregnKurs("Rubler"));
        System.out.println(kalkulator.beregnKurs("Denne eksisterer ikke"));
    }
}

