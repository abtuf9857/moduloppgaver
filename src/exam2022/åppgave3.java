package exam2022;
import static javax.swing.JOptionPane.*;
public class åppgave3 {
    public static void main(String[]args){
        double vekt,høyde;
        String innVekt=showInputDialog("Skriv inn vekt i kg");
        String innHøyde=showInputDialog("Skriv inn høyden i cm");
        try{
            vekt=Double.parseDouble(innVekt);
            høyde=Double.parseDouble(innHøyde);
        }
        catch (Exception e ){
            vekt=0;
            høyde=0;
        }
        if(vekt<=0 ||høyde<=0){
            System.out.println("Ikke gyldig input");
        }
        else{
            double bmi=(1.3*vekt)/(Math.pow(høyde/100,2.5));
            System.out.println("BMIen din er "+bmi);
        }
    }
}
