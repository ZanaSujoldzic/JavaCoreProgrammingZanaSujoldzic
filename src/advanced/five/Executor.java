
package advanced.five;

public class Executor {
    public static void main(String[] args) {
        
        Person person = new Person(0, "Zana", "Sujoldžić", "Kalibunar 21", "Travnik");
        
        PersonTester personTester = new PersonTester() {
            @Override
            public boolean test(Person p) {
                return (p.getAdress().equals("Travnik")) ;
            }
        };
        
     PersonTester personTester1 = (Person p) -> p.getAdress().equals("Travnik");
     
     PersonTester pt2 = (Person p) -> {
         boolean result = p.getCity().equals("Travnik");
         return result;
     };
        personTester.test(person);
        
    
}
}
