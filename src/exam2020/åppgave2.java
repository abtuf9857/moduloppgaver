package exam2020;



class Peerson{
    private String navn;
    private String personnr;
    private int alder;

    public Peerson(String navn, String personnr, int alder) {
        this.navn = navn;
        this.personnr = personnr;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Person info" +
                "navn= " + navn + '\'' +
                "personnr= " + personnr + '\'' +
                ", alder= " + alder;
    }
}
class pasient extends Peerson{
    private String diagnose;
    public pasient(String navn,String personnr,int alder,String diagnose){
        super(navn, personnr, alder);
        this.diagnose=diagnose;
    }

    public String toString() {
        String ut = super.toString();
        ut+= "Diagnosen er : " + this.diagnose;
        return ut;

    }
}
class lege extends Peerson{
    Pasient[]pasienter=new Pasient [100];
    public lege(String navn,String personnr,int alder,Pasient []pasienter){
        super(navn,personnr,alder);
        this.pasienter=pasienter;
    }
    public String pasienterToString(){
        String ut="";
        for (Pasient pasient:this.pasienter){
            ut+=pasient.toString();
    }
        return ut;
}

    @Override
    public String toString() {
        String ut=super.toString();
        ut+="pasientene : "+this.pasienterToString();
        return ut;
    }
}
public class åppgave2 {
    public static void main(String[]args){

        Pasient[]pasienter=new Pasient[2];

        Pasient tu = new Pasient("tu", "12", 23, "hopp");
        Pasient fa = new Pasient("fa", "21", 32, "tau");

        pasienter[0] = tu;
        pasienter[1]=fa;

        lege neg = new lege("grov", "34", 30, pasienter);
        System.out.println(neg);
    }
}
