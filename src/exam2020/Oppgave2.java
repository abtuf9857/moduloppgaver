package exam2020;

class Person{
    private String navn;
    private String personnummer;
    private int alder;

    public Person(String navn,String personnummer,int alder){
        this.navn=navn;
        this.personnummer=personnummer;
        this.alder=alder;

    }
    public String toString(){
        String ut=" Personinfo : ";
        ut+=" Navn til person er : "+this.navn+"\n";
        ut+=" Personnummer til person er : "+this.personnummer+"\n";
        ut+=" Alder til person er "+this.alder+"\n";
        return ut;
    }
}
class Pasient extends Person {
    private String diagnose;

    public Pasient (String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

    public String toString() {
        String ut = super.toString();
        ut+= "Diagnosen er : " + this.diagnose;
        return ut;

    }
}
class Lege extends Person{
    Pasient[] pasienter=new Pasient[100]; // [{navn:sinan, diagnose:hjertefeil}, {navn: tufa, diagnose:pollen}]

    public Lege(String navn,String personnummer,int alder,Pasient[] pasienter){
        super(navn, personnummer, alder);
        this.pasienter=pasienter;

        }

        public String pasienterToString(){
        String ut = "";
        for (Pasient pasient : this.pasienter){
            ut +=pasient.toString();
        }
        return ut;
        }
        public String toString(){
        String ut=super.toString();
        ut+=" Pasientene : " + this.pasienterToString();
        return ut;
        }
        }

public class Oppgave2 {
    public static void main(String []args){

        Pasient[] pasienter=new Pasient[2];


        Pasient Tufa=new Pasient("Tufa","12345",23,"pollen");
        Pasient Sinan=new Pasient("Sinan","3456",27,"hjertefeil");

        pasienter[0]=Tufa;
        pasienter[1]=Sinan;

        Lege Karl=new Lege("Karl","32345",35,pasienter);
        System.out.println(Karl);

    }
}
