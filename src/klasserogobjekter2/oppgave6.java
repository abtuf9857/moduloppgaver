/*Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).  Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i. Bruk gjerne Math.pow funksjonen for å foreta beregningen.

Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.

Nedenfor illustreres hvordan klassen og metodene skal se ut:

public class Vind {
   private double vindHastighet = 0.0;

   // her skal det inn en konstruktør for å sette vindhastigheten

   public double getVindhastighet() {
   // sett inn kode her
   }

   public boolean erOrkan() {
   // sett inn kode her
   }

   public boolean erVindstille() {
   // sett inn kode her
   }

   public double getKnop() {
   // sett inn kode her
   }

   public int getBeaufort() {
   // sett inn kode her
   }
}
Lag så kode for å teste ut metodene via en main-metode.

 */

package klasserogobjekter2;

import static javax.swing.JOptionPane.*;
 class Vind {
    private double vindHastighet=120.0;

//metode for å hente vindhastighet
    public double getVindHastighet() {
        return this.vindHastighet;
    }

    //metode som viser om det er orkan
    public boolean erOrkan(){
        return vindHastighet>=120;
        }

        //metode for å vise om det er vindstille
        public boolean ervindStille(){
         return vindHastighet <=2;
    }
    //metode for å regne ut knop
    public double getKnop(){
       return vindHastighet / 1.852;
    }

    //metode for å regne ut beaufort
    public int getBeaufort (){
        return (int)(Math.pow(vindHastighet/3.01,0.6666)+0.5);
    }
}
   public class oppgave6{
  public static void main(String []args){
      //her testes og regnes alt sammen ut
      Vind vindTest = new Vind();
      System.out.println(vindTest.getVindHastighet());
      System.out.println(vindTest.erOrkan());
      System.out.println(vindTest.ervindStille());
      System.out.println(vindTest.getKnop());
      System.out.println(vindTest.getBeaufort());
  }
   }
