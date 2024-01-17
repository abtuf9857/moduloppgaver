package exam2018;

public class åppgave2 {
    public static void main(String[]args){
        int[]liste={-3,41,5,-3,2,49};
//skrive ut antall tall større enn 10
        int teller=0;
        for(int i:liste){
            if(i>10){
                teller++;
                System.out.print("Antall tall større enn 10 er : "+teller);
            }

        }
        //skrive ut annet hvert tall
        for(int i=0; i<liste.length;i+=2){
            System.out.print(i);


        }
        //summen av alle positive tall i arrayet
        int sum=0;
        int Teller=0;
        for(int i:liste){
            sum+=i;
            Teller++;
            System.out.println(i);
        }
        //gjennomsnittet av alle positive tall i arrayet
        double gjennomsnitt=(double) sum/teller;
        System.out.print(gjennomsnitt);
    }
}
