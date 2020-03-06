import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Temp
 */
public class Temp {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("sisendfail.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("valjundfail.txt"));
        List<String> temps = new ArrayList<>();
        String line = reader.readLine();

        /*lisan sisendfailist loetud asjad massiivi */
        while(line != null){
            temps.add(line);
            line = reader.readLine();
        }
       
        /*System.out.println(temps);*/

        double kesk = 0;
        int v = temps.size() - 1;
        
        for(int i = 0; i < temps.size(); i++){
            String[] lineContent = temps.get(i).split(" ");
            kesk = (Double.parseDouble(lineContent[1])/ 2 +  Double.parseDouble(lineContent[v])/ 2 +  Double.parseDouble(lineContent[2]) + Double.parseDouble(lineContent[3])+  Double.parseDouble(lineContent[4])) / 5/*see on antud et igal päeval mõõdeti 5 korda temperatuuri */ ;
            
            /*keskmised.add(kesk);*/
            System.out.println(lineContent[0] + " keskmine temperatuur oli: " + kesk + "°C.");
            writer.write(lineContent[0] + " keskmine temperatuur: " + kesk + "°C." + " \n");/* kirjutan leitud keskmised koos kuupäevadega uude faili */
        }

        /* sulgen readeri ja writeri */
        reader.close();
        writer.close();

    }
}