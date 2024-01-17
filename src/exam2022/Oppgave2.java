package exam2022;
/*Lag en klasse kalt Liste for å behandle arrays.
Lag følgende statiske metoder i denne klassen som behandler arrays:
1) Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
2) Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal
også inn i metoden)
3) Tar et heltallsarray inn og finner det største tallet i arrayet
Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
Resultatet skal skrives ut på System.out. */
    class Liste{
        //metode for positive tall
        public static int positive(int[]liste){
            int teller=0;
            for(int i : liste){
                if(i>0){
                    teller++;
                }
            }
            return teller;
        }
        //metode for å vise antall tall i lista
        public static int antallTall(int[]liste,int tall){
            int teller =0;
            for(int i : liste){
                if(i==tall){
                    teller++;
                }
            }
            return teller;
        }
        //metode for å finne største tall i lista
        public static int størst(int[]liste){
            int størst=liste[0];
            for(int i:liste){
                if(i>størst){
                    størst=i;
                }
            }
            return størst;
        }
    }
    //main metode som kjører alle metodene i klassen liste
public class Oppgave2 {
        public static void main(String []args){
            int[]liste={1,2,4,-45,6,1,2};
            System.out.println("Antall positive tall i lista er : "+Liste.positive(liste));
            System.out.println("Antall enere i lista er : "+Liste.antallTall(liste,1));
            System.out.println("Det største tallet i lista er : "+Liste.størst(liste));
        }

}
