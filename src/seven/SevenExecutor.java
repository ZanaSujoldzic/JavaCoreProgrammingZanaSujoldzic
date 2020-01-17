
package seven;


public class SevenExecutor {
    public static void main(String[] args) {
        Person p1 = new Person("Ivo", "Andrić");
        personInfo(p1);
        // ILI, ukoliko je nestatička funkcija:
        
       // SevenExecutor sevenExecutorObject = new SevenExecutor();
      //  sevenExecutorObject.personInfo(p1);
        
        Person p2 = new Person("Meša", "Selimović");
        personInfo(p2);
        
        Person.InnerClass i1 = p2.new InnerClass(0, 0);
        Person.StaticInnerClass s1 = new Person.StaticInnerClass(0, 0);
                
        Person p3 = new Person("Dario", "Džamonja");
        personInfo(p3);
        
        p3.addMoney("Uplaćena sredstva:", 125.0, 6975.56);
        
        int number1 = 10;
        int number2 = 11;
        System.out.println("n1 = " + number1 + ", n2 = " + number2);
        swap(number1, number2);
        System.out.println("n1 = " + number1 + ", n2 = " + number2);
        
        Person p = new Person("Haled", "Hosseini");
        int number = 55;
        System.out.println("Number = " + number + " Person: " + p.toString());
        swapPerson(number, p);
        System.out.println("Number = " + number + " Person: " + p.toString());
        
    }
    
    public static void personInfo(Person p){
        System.out.println("Name: " + p.getName() + ", Surname: " + p.getSurname());
        Person.printCounter(p);
    }
    
    private static void swap(int n1, int n2){
        System.out.println("U funkciji: ");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        int temp = n2;
        n2 = n1;
        n1 = temp;
       System.out.println("n1 = " + n1 + ", n2 = " + n2);
        System.out.println("Funkcija završila...");
    }
    
    private static void swapPerson(int number, Person p){
        number = 59;
        p.setName("Custom name");
        p.setSurname("Custom surname");
    }
    
 
}
