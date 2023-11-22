package exam2019;
/*Det skal lages en "Lottogenerator". Denne skal generere 7 vinnertall mellom 1 og 34.
Vinnertallene skal sorteres fra minste til største tallet og skrives ut på System.out.
Lag en egen klasse kalt Trekning. Denne klassen skal inneholde en metode som
kalles vinnere. Denne metoden skal ikke ta noen parametere inn, men returnere et
heltallsarray med de 7 vinnertallene sortert.
Bruk f.eks
(int )(Math.random() * 34 + 1);
for å generere et randomisert tall mellom 1 og 34 og
Arrays.sort(vinnere); // er en del av java.util.Arrays
for å sortere vinner-arrayet før det returneres.
Lag også en main-metode som oppretter et trekningsobjekt, kaller metoden vinnere
og skriver ut resultatet av arrayet i System.out.
 */
import java.util.Arrays;
class Trekning {
    //vinner metode som ikke tar noen parameter
    public int[] vinnere() {
        int[] vinnere = new int[7];
        int i = 0;
        while (i < 7) {
            //metode som lager tilfeldige tall mellom 1 og 34
            int random = (int) (Math.random() * 34 +1);
            //denne forløkken ser om det tilfeldige tallet random er i arrayet fra før
            boolean funnet = false;
            for (int j = 0; j < 7; j++) {
                if (vinnere[j] == random) {
                    funnet = true;
                }
            }
            //Hva gjør denne?
            if (!funnet) {
                vinnere[i] = random;
                i++;

            }
        }
        //her returneres de syv vinnerne av vinner metoden
        Arrays.sort(vinnere);
        return vinnere;
    }
}
public class Oppgave2 {
    public static void main(String []args) {
        //trekning klassen blir instansiert
        Trekning enTrekning = new Trekning();
        //her blir vinner metoden kalt på
        int[] vinnere = enTrekning.vinnere();

        System.out.print("Vinnerene er ");
        for (int v : vinnere) {
            System.out.print(v + " ");
        }
    }

}
