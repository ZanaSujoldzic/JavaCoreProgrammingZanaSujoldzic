
package advanced.four;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        
        try(InputStream inputStream = new FileInputStream("persons.txt");
                Scanner scanner = new Scanner(inputStream);){
            StringBuilder sb = new StringBuilder();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                sb.append(line + System.lineSeparator());
            }
            String content = sb.toString();
            upisiUDrugiFajl(content);
            
        }catch(IOException ex){
            System.err.println(ex.getLocalizedMessage());
        }
        
        
    }
    
    static void upisiUDrugiFajl(String content){
           try(Writer fw = new FileWriter("persons.txt");
                   PrintWriter out = new PrintWriter(fw)){
               out.println(content);
               
           }catch(IOException ex){
               System.err.println(ex.getLocalizedMessage());
           }
        }
    
}
