package klasserogobjekter2;

import static javax.swing.JOptionPane.*;
 class Vind {
    private double vindHastighet=120.0;


    public double getVindHastighet() {
        return this.vindHastighet;
    }
    public boolean erOrkan(){
        return vindHastighet>=120;
        }
        public boolean ervindStille(){
         return vindHastighet <=2;
    }
    public double getKnop(){
       return vindHastighet / 1.852;
    }
    public int getBeaufort (){
        return (int)(Math.pow(vindHastighet/3.01,0.6666)+0.5);
    }
}
   public class oppgave6{
  public static void main(String []args){
      Vind vindTest = new Vind();
      System.out.println(vindTest.getVindHastighet());
      System.out.println(vindTest.erOrkan());
      System.out.println(vindTest.ervindStille());
      System.out.println(vindTest.getKnop());
      System.out.println(vindTest.getBeaufort());
  }
   }
