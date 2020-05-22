public class Steps {
    private double amount;

    public Steps (double amount){
        this.amount = amount;
    }

    
    public double findSpeed(){
        return 60*amount;
    }
}