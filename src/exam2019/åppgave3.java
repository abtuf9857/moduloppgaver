package exam2019;
import java.util.ArrayList;

class Book{
    private String tittel;
    private String forfatter;
    private double pris;

    public Book(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Bok info : " +
                "tittel er " + tittel + '\'' +
                ", forfatter er " + forfatter + '\'' +
                ", pris er " + pris;
    }
}
class papirbook extends Book{
    private int isbnnummer;

    public papirbook(String tittel,String forfatter,double pris,int isbnnummer){
        super(tittel, forfatter, pris);
        this.isbnnummer=isbnnummer;
    }
    public String toString(){
        return super.toString()+
                "isbnnummer er "+isbnnummer;
    }
}
class Lydbook extends Book{
    private int lengdeiminutter;
    public Lydbook(String tittel,String forfatter,double pris,int lengdeiminutter){
        super(tittel, forfatter, pris);
        this.lengdeiminutter=lengdeiminutter;
    }
    public String toString(){
        return super.toString()+
                "Lengden i minutter er : "+lengdeiminutter;
    }
}
public class åppgave3 {
    public static void main(String[]args){
        ArrayList<Book>bøker=new ArrayList<>();
        papirbook nybok1=new papirbook("AA","bb",43,25);
        Lydbook nybok2=new Lydbook("CC","DD",34,45);

        bøker.add(nybok1);
        bøker.add(nybok2);
        for(Book enbok:bøker){
            System.out.println(enbok);
        }

    }
}
