
package six;


public class SixExecutor {
    public static void main(String[] args) {
        
       // Person.counter = 3; // -> statičko polje, ne zahtijeva postojanje objekta
   
        Person p1 = new Person("Zana", "Sujoldžić"); // klasa KAO tip podatka
        System.out.println(p1.name + " " + p1.surname);
        Person.printCounter(); // -> statička metoda
        Person p2 = new Person("Amen", 264.36);
        Person p3 = new Person("Dženi", 33);
        Person p4 = new Person("Bahrija", "Sujoldžić", 53);
        Person.printCounter();
        
 
        
    }
    
}
