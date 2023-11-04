//Lag et program som sjekker om to heltalls-arrays er like.
//Bruk løkker, ikke innebygd java klasse/metode.
package Arrays;
public class Oppgave6 {
    public static void main(String[]args){
        int[] liste1 = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] liste2 = {45, 34, 5, 8, 10, 2, 13, 25};
        if(liste1.length!=liste2.length){
            System.out.println("Arrayene er ikke like da de ikke er like lange");
        }
        else {
            boolean like= true;
            for (int i =0; i< liste1.length; i++){
                if(liste1[i]!=liste2[i]){
                    like=false;
                }
                if (like) {
                    System.out.println("Arrayene er like");
                }
                else {
                    System.out.println("Arrayene er ikke like");
                }
            }


        }
    }
}
