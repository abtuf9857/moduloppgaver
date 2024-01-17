package exam2022;

import java.util.ArrayList;

class bok{
    private String tittel;
    private String forfatter;
    private double pris;

    public bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Bok info " +
                "tittel= " + tittel + '\'' +
                ", forfatter= " + forfatter + '\'' +
                ", pris= " + pris +"\n";
    }
}
class pApirbok extends bok{
    private int isbn;
    public pApirbok(String tittel,String forfatter,double pris,int isbn){
        super(tittel, forfatter, pris);
        this.isbn=isbn;
    }
    public String toString(){
        return super.toString()+"isbn er "+isbn;
    }
}
class lydbok extends bok{
    private int lengdeiminutter;
    public lydbok(String tittel,String forfatter,double pris,int lengdeiminutter){
        super(tittel, forfatter, pris);
        this.lengdeiminutter=lengdeiminutter;
    }
    public String toString(){
        return super.toString()+"lengden i minutter er "+lengdeiminutter;
    }
}
public class åppgave5 {
    public static void main(String []args){
        ArrayList<bok>bøker=new ArrayList<>();
        pApirbok a=new pApirbok("A","A",3.5,5);
        lydbok b=new lydbok("B","B",3986.7,900);
        bøker.add(a);
        bøker.add(b);

        for(bok enbok:bøker){
            System.out.println(enbok);
        }

    }
}
