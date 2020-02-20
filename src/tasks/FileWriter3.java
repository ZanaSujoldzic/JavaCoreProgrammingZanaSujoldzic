
package tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileWriter3 {
    public static void main(String[] args) throws IOException {
        
    try(InputStream input1 = new FileInputStream("prvifajl.txt");
            InputStream input2 = new FileInputStream("drugifajl.txt");
            Scanner scanner1 =new Scanner(input1);
            Scanner scanner2 = new Scanner(input2);){
            StringBuilder sb = new StringBuilder();
            while(scanner1.hasNextLine() && scanner2.hasNextLine()){
                String line1 = scanner1.nextLine();
                String line2 = scanner2.nextLine();
                sb.append(line1 + line2 + System.lineSeparator());
               
            }
             
            String content = sb.toString();
           
         upisiUDrugiFajl(content);
   
   
            }
   
   
     
     catch (FileNotFoundException ex) {
            System.err.println(ex.getLocalizedMessage());        }
    }

    static void upisiUDrugiFajl(String content){
         try(FileWriter fileWriter = new FileWriter ("trecifajl.txt");
         PrintWriter out = new PrintWriter(fileWriter)){
           out.println(content);
       }catch(Exception e){
           System.err.println(e. getLocalizedMessage());    
        
        
        
     
        
    }
    
}
}
