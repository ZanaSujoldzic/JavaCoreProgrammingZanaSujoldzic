
package eight;

public class EnumExecutor {
    public static void main(String[] args) {
        Person person = new Person();
        Animal animal = new Animal("Vodozemci");
        WeekDays monday = new WeekDays(0, "Monday");
        
        Gender spol = Gender.FEMALE;
        System.out.println(spol.getName());
    }
    
}
