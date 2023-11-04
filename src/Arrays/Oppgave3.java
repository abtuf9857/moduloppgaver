/*Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen. Skriv så ut
for og etternavn på flere linjer med en løkke som vist under:

Per Hansen
Line Olsen
.... */
package Arrays;
public class Oppgave3 {
    public static void main(String[]args){
        String []navn={"Per","Hansen","Line","Olsen","Kari","Finnsen"};
        for(int i=0;i< navn.length;i+=2){
            System.out.println(navn[i]+" "+navn[i+1]);
        }
    }
}
