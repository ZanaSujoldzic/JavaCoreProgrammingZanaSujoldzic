
package tasks;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWriter2 {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        sentence.add("Zadaća sa prezentacije.");
        sentence.add("Spajanje fajlova.");
        sentence.add("Dodati dva fajla u treći fajl.");
        
        try(FileWriter writer = new FileWriter("drugifajl.txt");
                PrintWriter out = new PrintWriter(writer)){
            for(String sentences : sentence){
                out.println(sentences); 
            }
               
        }catch(Exception e){
            System.err.println(e.getLocalizedMessage());
        }
    }
    
}
