//Gruppe 73 obligue 2 oppgave1
//Abdurahim Mustafa Tufa 385569
//Abdirahman Mohammed Hassan 385544
//Abdi Aziz Alinor Sharif 375054

package Obligue2;

public class oppgave1 {

     //metode som leser inn nedre og øvre grense for sum
    public static void tall (int nedre_grense, int øvre_grense) {
        if (øvre_grense <= nedre_grense) {
            System.out.print("Øvre grense er mindre enn eller lik øvre grense");
        }
        else{
            //for loop kode gjør at verdier returneres og kan øke hver gang de blir returnert
            //koden for loop er hentet fra W3 schools
            
            int sum=0;
            for (int i = nedre_grense; i <= øvre_grense; i++) {
                System.out.print(i);
                sum= sum + i;

                if(i %10==0){
                    System.out.println();
                } else {
                    System.out.print(" +"+" ");
                }
                if (i == øvre_grense) {
                    System.out.print(" = ");
                }

            }
            System.out.print(sum);



        }

    }
    //I main metoden kjøres programmet og det er også her nedre og øvre grense får en verdi
    public static void main (String[]args){
        tall(1,100);
    }
}