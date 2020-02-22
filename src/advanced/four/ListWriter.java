
package advanced.four;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListWriter {
    
    private static final int SIZE = 10;
    private List<String> names;
    
    public ListWriter() {
        this.names = new ArrayList<>();
        for(int i = 0; i<SIZE; i++){
            System.out.println("Person" + i);   
        }
    }
    
    public void printNames(){
        try(FileWriter writer = new FileWriter("persons.txt");
        PrintWriter out = new PrintWriter(writer)){
        for(String name : names){
          out.println(name);
        }
        }catch(IOException ex){
            System.err.println(ex.getLocalizedMessage());
        }
    }
    
}
