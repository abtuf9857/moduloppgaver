//Gruppe 73
//Abdurahim Mustafa Tufa 385569
//Abdirahman Mohammed Hassan 385544
//Abdi Aziz Alinor Sharif 375054

package oblig1;

//oblig1oppgave1
class sirkel {
//Beregner og returnerer diameter
    public static double diameter(double radius){
        double sum= radius * 2;
        return sum;
    }
    //Beregner og returnerer omkrets
    public static double omkrets(double radius  ){
        double sum= radius * 2* Math.PI;
        return sum;
    }
    //Beregner og returnerer areal
   public static double areal( double radius){
        double sum= Math.PI * Math.pow(radius,2);
        return sum;
   }

    public static void main(String []args){
        System.out.println("Diameter av sirkelen med radius 23.5 er "+String.format("%.2f",diameter(23.5)) );
        System.out.println("Omkretsen av sirkelen med radius 23.5 er "+String.format("%.2f",omkrets(23.5)));
        System.out.println("Arealet til sirkelen med radius 23.5 er "+ String.format("%.2f",areal(23.5)));

    }

}


