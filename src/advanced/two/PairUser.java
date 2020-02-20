
package advanced.two;

import java.util.List;
import seven.Person;


public class PairUser {
    public static void main(String[] args) {
        
        Integer key = 0;
        Person p = new Person("Zana", "Sujoldžić");
        
        Pair<Integer, Person> pair = new OrderedPair<Integer, Person>(key, p);
        System.out.println(p);
        
        Pair<Person, Person> pair1 = new OrderedPair<>(new Person("Brad", "Pitt"), new Person("Pit", "Sampras"));
        Pair<Integer, Person> pair2 = new UnorderedPair<>(1, new Person("Angelina", "Jolie"));
        
        // UTIL
        
        Person p1 = new Person("Omar", "Topčić");
        Person p2 = new Person("Omar", "Topčić");
        
        // >= Java 1.8
        
        boolean equality = Util.compare(p1, p2);
        
    }
    
    
}
