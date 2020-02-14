import java.util.Arrays;

/**
 * Ul6
 */
public class Ul6 {

    public static void main(String[] args) {
        int[] arr = {1, 32, 7}; 
        System.out.println("Sorteerimata jada: "+ Arrays.toString(arr));
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
        System.out.println("Sorteeriti "+ counter + " korda.");    }
}