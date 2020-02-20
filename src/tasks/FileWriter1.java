
package tasks;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWriter1 {
    public static void main(String[] args) {
        
       int SIZE = 10;
    
    List<String> names;
    
    names = new ArrayList<>();
    for(int i = 0; i<SIZE; i++){
        names.add("Person" + i);
    }
        
      try(FileWriter writer = new FileWriter("prvifajl.txt");
              PrintWriter out = new PrintWriter(writer)){
          for(String name : names){
              out.println(name);
          }
      }catch(Exception e){
          System.err.println(e.getLocalizedMessage());
      }  
        
        
        
    }
    
}
