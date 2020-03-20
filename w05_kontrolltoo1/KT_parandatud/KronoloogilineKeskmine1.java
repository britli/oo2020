/**
 * KronoloogilineKeskmine1
 */
public class KronoloogilineKeskmine1 {

    public static void main(String[] args) {
        int[] arr = {10, 30, 70}; 
        double kesk = 0;

        /* Leian keskmise */
        for(int i = 0; i < arr.length; i++){
            kesk = (arr[0]/2 + arr[1] + arr[2]/2) / 2;

        }

        /* prindin keskmise välja */
        System.out.println("Antud arvude kronoloogiline keskmine on: " + kesk);
    }
}