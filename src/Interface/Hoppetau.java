package Interface;

interface Hoppetauu {
    public double lengde();
    public String getStoff();
//}
//class Tau1 implements Hoppetauu{
  //  private double lengde;
   // private String Stoff;

  //  public Tau1(double lengde,String Stoff){
    //    this.lengde=lengde;
   //     this.Stoff=Stoff;
   // }
    //public String getStoff{
     //   return this.Stoff;
    //}

  //  public double lønn(){
     //   return lengde+5;
    }

  //  }
class Tau2 implements Hoppetauu{
    private double lengde;
    private String Stoff;

    public Tau2(double lengde, String Stoff) {
        this.lengde=lengde;
        this.Stoff=Stoff;
    }
    public String getStoff(){
        return this.Stoff;
    }
    public double lengde(){
        return this.lengde;
    }
}
public class Hoppetau{
    public static void main(String []args){
       // Hoppetauu enTau1= new Tau1(3,"nylon");
        Hoppetauu enTau2= new Tau2(5,"gummi");
    }
    Hoppetauu[]liste =new Hoppetauu[10];
   // liste[0]=enTau1;
  //  liste[1]=enTau2;

    {
        //  for(Hoppetauu enHoppetauu : liste) {

        //   if (enHoppetauu != null) {
        // System.out.println. (enHoppetauu.getStoff() + " lengden er " + enHoppetauu.lengde())
    }}