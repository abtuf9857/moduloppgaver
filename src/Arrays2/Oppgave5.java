//Det er definert et to-dimensjonalt helttalls-array (se under).
// Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).
//Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.
//4	6	2	5
//7	9	4	8
//6	9	3	7
package Arrays2;
public class Oppgave5 {
    public static void main(String []args){
        int[][] filmscores = new int [4][3];
        filmscores[0][0]=4;
        filmscores[0][1]=7;
        filmscores[0][2]=6;
        filmscores[1][0]=6;
        filmscores[1][1]=9;
        filmscores[1][2]=9;
        filmscores[2][0]=2;
        filmscores[2][1]=4;
        filmscores[2][2]=3;
        filmscores[3][0]=5;
        filmscores[3][1]=8;
        filmscores[3][2]=7;

        //metode for å summere rader og finne gjennomsnitt for hver rad før det skrives ut
        for(int[] row : filmscores){
            int sum = 0;
            for(int score : row){
                sum += score;
            }
            System.out.println(sum/ row.length);
        }

    }


}
