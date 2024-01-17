package exam2020;
/*
class Pers{
    private String navn;
    private String personnr;
    private int alder;

    public Pers(String navn, String personnr, int alder) {
        this.navn = navn;
        this.personnr = personnr;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Person data " +
                "navn=" + navn + '\'' +
                ", personnr=" + personnr + '\'' +
                ", alder= " + alder;
    }
}
class pasi extends Pers{
    private String diagnose;
    public pasi(String navn,String personnr,int alder,String diagnose){
        super(navn, personnr, alder);
        this.diagnose=diagnose;
    }
    public String toString(){
        return super.toString()+"Diagnosen er "+diagnose;
    }
}
class leg extends Pers{
    Pasient[]pasienter=new Pasient[100];
    public leg(String navn,String personnr,int alder){
        super(navn, personnr, alder);
    }
    public String toString() {
        String ut=" ";
        for(Pasient nyPasient:pasienter){
            if(nyPasient!=null){
                ut+=nyPasient;
            }
        }
        return "lege"+"\n"+super.toString()+ut;
    }
}

public class opgv2 {
    public static void main(String[]args){

        pasi tufa=new pasi("Tufa","123",19,"hjerneprob");
        pasi afut=new pasi("afut","321",91,"hjerneprob");

        leg grovneg=new leg("Grov","345",23);

        grovneg.pasienter[0]=tufa;
        grovneg.pasienter[1]=afut;

        System.out.println(grovneg); */



