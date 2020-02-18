
package advanced.one.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class CollectionExecutor {
    public static void main(String[] args) {
        
        //KOLEKCIJE
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Zana");
        names.add("Zana");
        names.add("Zana");
        names.add("Amen");
        names.add("Omar");
        names.add("Bahrija");
        names.add("Dženi");
        printCollection(names);
        
        System.out.println("Linked lista:");
        
        LinkedList<String> names1 = new LinkedList<>();
        names1.add("Amen");
        names1.add("Omar");
        names1.add("Omar");
        names1.add("Omar");
        names1.add("Dženi");
        names1.add("Bahrija");
        names1.add("Zana");
        printCollection(names1);
        
        System.out.println("HashSet: ");
        
        HashSet<String> names2 = new HashSet<>();
        names2.add("Amen");
        names2.add("Omar");
        names2.add("Omar");
        names2.add("Omar");
        names2.add("Dženi");
        names2.add("Bahrija");
        names2.add("Zana");
        printCollection(names2);
        
        System.out.println("Linked HashSet: ");
        
        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        names3.add("Amen");
        names3.add("Omar");
        names3.add("Omar");
        names3.add("Omar");
        names3.add("Dženi");
        names3.add("Bahrija");
        names3.add("Zana");
        printCollection(names3);
        
        
        
    }
    
    static void printCollection(Collection<String> names){
        for(String name: names){
            System.out.println(name);
        }
    }
        
        
    
}
