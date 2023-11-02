/*Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen
skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som
et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.

 */
package klasserogobjekter2;

import java.sql.SQLOutput;

//klasse med 5 attributter
class BensinKjøp {
    private String Bensinstasjonenssted;
    private String typebensin;
    private double antall_literfylt;
    double prisen_pr_liter;
    private String Tidspunkt_fylt;

    //metode for å finne totalprisen
    public double finnTotalprisen(){
        return antall_literfylt * prisen_pr_liter;
    }
    public String getBensinstasjonenssted() {
        return Bensinstasjonenssted;
    }

    public void setBensinstasjonenssted(String bensinstasjonenssted) {
        Bensinstasjonenssted = bensinstasjonenssted;
    }

    public String getTypebensin() {
        return typebensin;
    }

    public void setTypebensin(String typebensin) {
        this.typebensin = typebensin;
    }

    public double getAntall_literfylt() {
        return antall_literfylt;
    }

    public void setAntall_literfylt(double antall_literfylt) {
        this.antall_literfylt = antall_literfylt;
    }

    public double getPrisen_pr_liter() {
        return prisen_pr_liter;
    }

    public void setPrisen_pr_liter(double prisen_pr_liter) {
        this.prisen_pr_liter = prisen_pr_liter;
    }

    public String getTidspunkt_fylt() {
        return Tidspunkt_fylt;
    }

    public void setTidspunkt_fylt(String tidspunkt_fylt) {
        Tidspunkt_fylt = tidspunkt_fylt;
    }

    //konstruktør av klassen BensinKjøp
    private BensinKjøp (String Bensinstasjonenssted,String typebensin,Double antall_literfylt,Double prisen_pr_liter,
                        String Tidspunkt_fylt){
        this.Bensinstasjonenssted=Bensinstasjonenssted;
        this.typebensin=typebensin;
        this.antall_literfylt=antall_literfylt;
        this.prisen_pr_liter=prisen_pr_liter;
        this.Tidspunkt_fylt=Tidspunkt_fylt;


    }
    //metode for å kjøre programmet
    public static void main (String[]args) {
     BensinKjøp Sted= new BensinKjøp("" ,"",44.0,24.0,""
     );
     Double total=Sted.finnTotalprisen();
        System.out.println(String.format("%.2f",total));
    }
}