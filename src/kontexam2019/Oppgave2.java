package kontexam2019;
/*Det skal lages kode for en klasse kalt Skatt. Den skal ha følgende attributter
- navn (tekst)
- adresse (tekst)
- lønn (desimaltall)
- skatt (desimaltall)
Det også lages en metode i denne klassen som heter beregn. Denne metoden skal så beregne
skatten ut i fra lønnen etter følende formel:
Ved inntekter mindre enn 50.000 skal det ikke betales skatt.
Ved inntekter mellom 50.000 og 150.000 skal det betales 25% skatt på hele lønnen.
Inntekter over 150.000 skal det betales 35 % skatt på hele lønnen.
Metoden skal så sette den beregnede skatten i skatte-attributten. Det betyr at metoden ikke skal motta
noe eller returnere noe.
En metode toString() skal også lages. Denne skal formatere resultatet slik:
Per Hansen, Osloveien 82 0150 Oslo
Lønn : 400000.0 Skatt : 140000.0
Kod klassen og metodene under. Bruk en konstruktør. Det er ikke nødvendig å kode get/set-metoder.
Kod også kall til disse for å skrive resultatet til System.out.*/

//superklasse
class Skatt {
    String navn;
    String adresse;
    double lonn;
    double skatt;

    //konstruktør uten skatt variabelen
    public Skatt(String navn, String adresse, double lonn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lonn = lonn;
    }

    //tostring metode for å skrive ut attributtene
    @Override
    public String toString() {
        return "Skatt "+
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", lønn=" + lonn +
                ", skatt=" + skatt;
    }

//beregn metode som beregner skatt.
    public void beregn() {
        if (lonn < 50000) {
            skatt = 0;
            System.out.println("Du skal ikke betale skatt");
        }
        if (lonn > 50000 && lonn < 150000) {
            skatt = lonn / 100 * 25;
        }
        if (lonn >= 150000) {
            skatt = lonn / 100 * 35;
        }

    }

}
public class Oppgave2 {
        public static void main(String[]args){
            Skatt nySkatt=new Skatt("Tufa","Stovner Senter 1",100000);
            nySkatt.beregn();
            System.out.println(nySkatt);
        }
}


