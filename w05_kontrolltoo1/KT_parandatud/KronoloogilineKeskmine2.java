/**
 * KronoloogilineKeskmine2
 */
public class KronoloogilineKeskmine2 {

    public static void main(String[] args) {
        int[] arr = {10, 30, 70, 80, 90, 10, 4, 76}; 
        double kesk = 0;

        int v = arr.length - 1; /* et saada kätte masiivi viimase arvu asukoht */
        double sum = 0;

        /*arvutan kõikide arvude summa, et sealt hiljem esimene ja viimane  arv lahutada */
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        /*System.out.println("Antud arvude summa on: " + sum + " arr pikkus on " + arr.length);*/

        /*leian massiivi ulatuses kronoloogilise keskmise */
        for(int i = 0; i < arr.length; i++){
            kesk = Math.round((arr[0]/2 + arr[v]/2 + (sum - arr[0] - arr[v])) / (arr.length - 1));
        }

        /*prindin tulemuse lausena välja */
        System.out.println("Antud arvude kronoloogiline keskmine on: " + kesk);
    }
}