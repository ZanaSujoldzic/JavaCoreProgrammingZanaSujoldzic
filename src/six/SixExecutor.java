
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
        p3.putMoneyOnAccount(3657.89);
        p3.withdrawMoneyFromAccount(315.0);
        
       //  double p3balance = p3.getBalance(); ILI:
       
        System.out.println("Stanje na računu: " + p3.getBalance());
        p4.putMoneyOnAccount(635897125.05);
        p4.withdrawMoneyFromAccount(23654.25);
        printBalance(p4);
        
 
        
    }
    static void printBalance(Person p){
        System.out.println("Stanje na računu: " + p.getBalance());
    }
    
    
}
