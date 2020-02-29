
package advanced.three.homework;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PersonDataContainer {
   public List<Person> personData;

    public PersonDataContainer(List<Person> personData) {
        this.personData = personData;
    }
   
   public List<Person> writePersons(InputStream inputStream){
       List<Person> persons = new ArrayList<>();
       try(Scanner personScanner = new Scanner(inputStream)){
           
           String[] nizPolja = null;
           
           do{String korisnickiInput = personScanner.nextLine();
           nizPolja = korisnickiInput.split(" ");
           
           Person person = null;
           persons.add(person);
               
           }while(personScanner.hasNextLine() && nizPolja != null && nizPolja.length == 3);
           
       }catch(Exception ex){
           System.err.println(ex.getLocalizedMessage());
       }
       return persons;
   }
   

       

   
    
}
