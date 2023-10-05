package oblig1;

import static javax.swing.JOptionPane.showInputDialog;

class Vare {
    private String navn;
    private int antall;
    private double pris;

    //Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

//Get set metoder
    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String newNavn) {
        this.navn = newNavn;
    }


    public int getAntall() {
        return this.antall;
    }


    public void setAntallAntall(int newAntall) {
        if (newAntall > 0) {
            this.antall = newAntall;
        } else {
            this.pris = 0;
        }
    }


    public double getPris() {
        return pris;
    }

    public void setPris(double newPris) {
        if (newPris > 0) {
            this.pris = newPris;
        } else {
            this.pris = 0;
        }


    }

    public double totalpris() {
        return getPris() * getAntall();
    }


}

class main {
    //navn,antall og pris for vare 1
    public static void main(String[] args) {
        String vare1Navn = showInputDialog("Navn til vare er AbdiH");
        String innAntall1 = showInputDialog("Antall til vare er ");
        String innPris1 = showInputDialog("Prisen til vare er ");

    //navn,antall og pris for vare 2
        String vare2Navn = showInputDialog("Navn til andre vare er AbdiS");
        String antall2 = showInputDialog("Antall til andre er ");
        String pris2 = showInputDialog("Pris til andre vare er ");

        //To vare objekter for de innleste verdiene
        //antall1vare,pris1vare,antall2vare og pris2vare er objekter for de innleste verdiene.
        int antall1vare = 0;
        double pris1vare = 0;

        int antall2vare=0;
        double pris2vare=0;

        //Try and catch for å konvertere antall og pris for vare 1 og 2
        try {
            antall1vare = Integer.parseInt(innAntall1);
            pris1vare = Double.parseDouble(innPris1);

            antall2vare=Integer.parseInt(antall2);
            pris2vare=Double.parseDouble(pris2);
        } catch (Exception e) {
            System.out.println("Du skrev inn feil antall eller pris");
        }

        Vare vare1 = new Vare(vare1Navn, antall1vare, pris1vare);
        Vare vare2 = new Vare(vare2Navn, antall2vare, pris2vare);
        System.out.println(vare1.totalpris()+vare2.totalpris());
        System.out.println("Totalprisen ble:");

    }

}