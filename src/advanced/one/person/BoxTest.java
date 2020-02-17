
package advanced.one.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class BoxTest {
    public static void main(String[] args) {
        
        Box<Integer> adnanovaKutija = new Box<Integer>(23);
        Box<String> aleminaKutija = new Box<>("Alema");
        Box<Double> ivaninaKutija = new Box<>(23.55);
        
        // SIROVI TIP PODATKA
        //Box aldin = new Box(LocalDate.now()); 
        
        LocalDate now = LocalDate.now();
        Box<LocalDate> aldinovaKutija = new Box<>(now);
        
        Person[] persons = new Person[3];
        persons[0] = new Person("Zana", "Sujoldžić", LocalDate.of(1993, Month.MARCH, 11), Gender.FEMALE);
        persons[1] = new Person("Amen", "Topčić", LocalDate.of(2008, Month.MARCH, 31), Gender.MALE);
        persons[2] = new Person("Omar", "Topčić", LocalDate.of(2018, Month.FEBRUARY, 19), Gender.MALE);
        
        //DINAMIČKI NIZ, prima beskonačno elemenata koje možemo parametrizirati čim želimo
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Zana", "Sujoldžić", LocalDate.of(1993, Month.MARCH, 11), Gender.FEMALE));
        
    }
    
}
