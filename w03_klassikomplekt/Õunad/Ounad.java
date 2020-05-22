import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ounad
 */
public class Ounad {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        int N = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        List<Integer> baskets = new ArrayList<>();

        while(line != null){
            baskets.add(Integer.parseInt(line));
            line = reader.readLine();
        }

        reader.close();

        int sum = 0;
        

        for (int i=0; i < N ; i++){
            sum += baskets.get(i);
        }

        int divider = 1;
        int half = sum / 2;
        boolean equal = false;


        while(equal == false){
            int left = 0;
            for(int n = 0; n < divider; n++){
                left += baskets.get(n);
            }

            if(left >= half){
                if(Math.abs(sum - 2* left) <= Math.abs(sum - 2* left - 2* baskets.get(divider))){
                    equal = true;
                }else{
                    divider--;
                    equal = true;
                }
            }else{
                divider++;
            }
        }


        System.out.println(divider);


        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(Integer.toString(divider));
        writer.close();
    }
}