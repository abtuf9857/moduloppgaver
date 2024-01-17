package exam2021;

class FunnetTall {
    public static boolean funnetTall(int[] liste, int tall) {
        for (int i : liste) {
            if (i == tall) {
                return true;
            }
        }
        return false;
    }

    public class opgv2 {
        public static void main(String[] args) {
            int[] liste = {1, 2, 3, 4, 5, 6};
            boolean funnet = funnetTall(liste, 2);
            if (funnet) {
                System.out.println("Funnet");
            } else {
                System.out.println("Ikke funnet");
            }
        }
    }
}
