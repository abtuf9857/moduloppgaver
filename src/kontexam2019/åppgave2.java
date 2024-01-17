package kontexam2019;

class skatt{
    String navn;
    String adresse;
    double lønn;
    double skatt;

    public skatt(String navn, String adresse, double lønn, double skatt) {
        this.navn = navn;
        this.adresse = adresse;
        this.lønn = lønn;
        this.skatt = skatt;

    }

    @Override
    public String toString() {
        return "skatt " +
                "navn " + navn + '\'' +
                ", adresse " + adresse + '\'' +
                " lønn " + lønn +
                " skatt " + skatt;
    }
    public void beregn() {
        if (lønn > 50000) {
            System.out.println("Det skal ikke betales skatt");
        }
        if (lønn > 50000 && lønn < 150000) {
            skatt = (lønn / 100) * 25;
        }
        if (lønn >= 150000) {
            skatt = (lønn / 100) * 35;

        }
    }}
public class åppgave2 {
    public static void main(String[]args){
        skatt nyskatt=new skatt("S","S",5000000,3000);
        nyskatt.beregn();
        System.out.println(nyskatt);
    }

    }

