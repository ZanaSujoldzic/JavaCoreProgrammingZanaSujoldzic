
package six;

// Klasa koja se zove isto kao i fajl koji predstavlja je tzv. OUTER klasa

public class Person {
    
    // static properties
    
    private static int counter = 0;
    
    // object properties
    
    
    public int age;
    String name;
    protected String surname; // Polja mogu imati sva četiri modifikatora vidljivosti
    private double balance;
    
    // KONSTRUKTOR -> može imati sva 4 modifikatora vidljivosti
    
    // public Person(){
      // super(); // -> naslijeđeni konstruktor bez parametara
        
        // Konstruktor s parametrima
        
        public Person(String name, String surname){
            this(name, surname, 0);
            
        }
        // OVERLOAD po broju parametara, odnosno PREKLAPANJE po broju parametara
        
        public Person(String name1, String surname1, int age){
            this.name = name1;
            this.surname = surname1;
            this.age = age;
            counter++;
            
        }
        // OVERLOAD po tipu parametara, odnosno PREKLAPANJE po tipu parametara
        
        public Person(String name, double balance){
            this.name = name;
            this.balance = balance;
            counter++;
            
        }
        
        public Person (String name, int age){
            this.name = name;
            this.age = age;
            counter++;
            
        }
        
        public static void printCounter (){
            System.out.println("Counter = " + counter);
        }
    }
    

