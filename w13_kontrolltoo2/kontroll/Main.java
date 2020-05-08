import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {


        Pendelum myClass = new Pendelum(10);
        double duration = myClass.findDuration() * 1000;

        Scanner in = new Scanner(System.in);
        final Clock clock = new Pendelum(10);
        
        System.out.println("Mitu sekundit soovid et, kell tiksuks");
        int time = in.nextInt() * 100;

        for(int i = 0; i < time; i++){
            System.out.println(" tic ");

            try {
                Thread.sleep((long) duration);
            } catch(InterruptedException ex){
             
                System.exit(0);
            }

            System.out.println(" tac ");
            
            try {
                Thread.sleep((long) duration);
            } catch(InterruptedException ex){
             
                System.exit(0);
            }

        }

    }

}


