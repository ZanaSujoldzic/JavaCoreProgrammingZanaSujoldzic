
package seven;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person("Zana", "Sujoldžić");
        Student s1 = new Student("Dženi", "Topčić", "448-SPS");
        Teacher t1 = new Teacher("Bahrija", "Sujoldžić", "textile technologies");
        processPersons(p1, s1, t1);
        Car car = new Car();
        System.out.println("Polimorfizam");
        System.out.println(p1.toString());
        System.out.println(car.toString());
        
        
        
    }
    
    static void processPersons(Person... persons){
        for(int i = 0; i<persons.length; i++){
            Person p = persons[i];
            processPerson(p);
        }
        
    }
    
    static void processPerson(Person person){
        if(person instanceof Teacher){
            System.out.println(person.getName() + " -> Ja sam profesorica.");
            
        }else if(person instanceof Student){
            System.out.println(person.getName() + " -> Ja sam studentica.");
        }else{
            System.out.println(person.getName() + " -> Ja sam osoba.");
        }
    }
    
    
}
