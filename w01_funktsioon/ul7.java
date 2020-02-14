import java.util.Random;
import java.util.Scanner;

/**
 * proov
 */
public class proov {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Sisesta array suurus (10-10000): ");
        int b = in.nextInt();

        int[] arr = new int[b];

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(10000); 
            System.out.println(arr[i]);  
        }
 
        System.out.println("Sorteerimata jada: "+ arr[i]);
        int counter = 0;
        
        for(int i = 0; i < arr.length; i++){
            boolean sorted  = true;
            for (int j = 1; j < (arr.length - i); j++){
                if (arr[j - 1] > arr[j]) {
                    counter += 1;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }

            }
            if (sorted) break;   
        }
        System.out.println("Sorteeritud jada: "+ Arrays.toString(arr));
        System.out.println("Sorteeriti "+ counter + " korda.");
    }
}