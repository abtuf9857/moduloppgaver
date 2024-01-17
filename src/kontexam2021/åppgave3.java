package kontexam2021;

class fAg {
    String fagnavn;
    double år;

    public fAg(String fagnavn, double år) {
        this.fagnavn = fagnavn;
        this.år = år;
    }

    public String getFagnavn() {
        return fagnavn;
    }

    public void setFagnavn(String fagnavn) {
        this.fagnavn = fagnavn;
    }

    public double getÅr() {
        return år;
    }

    public void setÅr(double år) {
        this.år = år;
    }

    @Override
    public String toString() {
        return "Fag : "
                + fagnavn + '\'' +
                " år " + år;
    }
}

class sTudent {
    String navn;
    String Studnr;

    public sTudent(String navn, String studnr) {
        this.navn = navn;
        Studnr = studnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudnr() {
        return Studnr;
    }

    public void setStudnr(String studnr) {
        Studnr = studnr;
    }

    @Override
    public String toString() {
        return "Student :" +
                "navn= " + navn + '\'' +
                ",Studnr= " + Studnr + '\'';
    }
}

public class åppgave3 {
    public static void main(String[] args) {
        sTudent[] liste = new sTudent[10];
        fAg progging = new fAg("Programmering", 2020);
        sTudent tUfa = new sTudent("Tufa", "3456");
        sTudent ufaT = new sTudent("uFat", "3496");

        liste[0] = tUfa;
        liste[1] = ufaT;

        System.out.println(progging);
        System.out.println(liste[0]);
        System.out.println(liste[1]);
    }

}



