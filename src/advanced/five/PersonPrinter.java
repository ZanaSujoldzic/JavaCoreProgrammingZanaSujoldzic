
package advanced.five;

import java.util.Collections;
import java.util.List;

public class PersonPrinter {
    
    private final List<Person> persons;

    public PersonPrinter(List<Person> persons) {
        this.persons = persons;
    }
    
    public void printPersons1(){
        for(Person person : persons){
            System.out.println(person);
        }
         }
        public void printPersons2(){
        
        for(int i = 0; i<persons.size(); i++){
            Person person = persons.get(i);
            System.out.println(person);
        }
        }
        
        public void printPersonWithSpecificName(String name){
            
            Collections.sort(persons);
            for(Person p : persons){
               boolean condition = p.getName().equals(name);
               if(condition){
                   System.out.println(p);
               }
            }
        }
        
        public void printPersonsAfterTesting(PersonTester personTester){
            for(Person p : persons){
                if(personTester.test(p)){
                    System.out.println(p);
                }
            }
        }
   
    
}
