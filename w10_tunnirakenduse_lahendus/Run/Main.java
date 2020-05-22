/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Steps steps = new Steps(7);
        double amount = steps.findSpeed();

        Tree tree = new Tree(9);
        double stepsAround = tree.getAround();

        int counter = 0;


    for(;;){
        for(int i = 0; i < stepsAround; i++){
            System.out.println(" ... ");

            try {
                Thread.sleep((long) amount);
            } catch(InterruptedException ex){
            
                System.exit(0);
            }
        }
        counter ++;
        System.out.println( counter + ". ring");

    }
    }   

}

