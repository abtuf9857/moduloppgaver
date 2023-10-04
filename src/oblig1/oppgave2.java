package oblig1;

class vare {
   private String navn;
    private int antall;
    private double pris;
    public vare(String navn,int antall, double pris){
        this.navn=navn;
        this.antall=antall;
        this.pris=pris;
    }

    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String newNavn){
        this.navn = newNavn;
    }
    public int getAntall(){
        return this.antall;
    }

    public void setAntallAntall(int newAntall){
        this.antall = newAntall;

        }
    public double getPris(double pris){
        return this.pris;
    }

    public void setPris(double newPris){
        this.pris = newPris;
    }
          public double totalpris(){
          return this.pris*this.antall;
          }
    public static void main (String []args) {

    }
}




