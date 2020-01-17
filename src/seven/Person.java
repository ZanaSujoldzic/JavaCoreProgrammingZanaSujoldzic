
package seven;

public class Person {
    private static int counter = 0;
    private String name;
    private String surname;
    private int age;
    private double balance = 0.0;
    
    public Person(String name, String surname){
        this(name, surname, 0);
    }
    
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
        // Ili pozivanjem klase StringBuilder
    }
    
    public int getAge(){
        return age;
    }
    public static void printCounter(Person p){
        System.out.println("Print counter: " + counter);
    }
    
    // ... -> VAR ARGS - unutar zagrade možemo ih kombinovati s drugim tipovima,s tim da varijabilni argumenti moraju biti na kraju
    public void addMoney(String message, double...moneyAmounts){
        System.out.print(message + " ->");
        for(double amount : moneyAmounts){
            balance = balance + amount;
        }
        System.out.println(" Balance: " + balance);
    }
     public void spendMoney(double money){
        balance = balance - money;
    }
     
     // Objektna Inner class / mo\e imati sva ;etiri modifikatora vidljivosti
     
     public class InnerClass{
         private int x;
         private int y;
         

        public InnerClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
            
}
     
     // Statička Inner class
        public static class StaticInnerClass {
         private int x;
         private int y;
         

        public StaticInnerClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
                   
            
        }
 }
