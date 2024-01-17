package exam2018;

class Annsatt{
    String navn;
    int alder;
    String personnr;

    public Annsatt(String navn, int alder, String personnr) {
        this.navn = navn;
        this.alder = alder;
        this.personnr = personnr;
    }

    @Override
    public String toString() {
        return "Personalia: "+"\n" +
                "navn : "+ navn +
                " alder : "+ alder +
                ", personnr er " + personnr;
    }
}

public class åppgave4 {
    public static void main(String[]args){
Annsatt Deebow=new Annsatt("Deebow",20,"45643");
        System.out.println(Deebow);
    }
}
