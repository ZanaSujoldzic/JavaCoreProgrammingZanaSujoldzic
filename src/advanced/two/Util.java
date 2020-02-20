
package advanced.two;


public class Util {
    
    // K i V NIJE moguće koristiti kao polje klase jer nije vidljiv u bloku koda klase, samo u bloku koda funkcije!!!
    
    public static <K, V> boolean compare(K value1, V value2){
        return value1.equals(value2);
    }
    
    public static <K extends Integer, V extends Integer> int compareNumbers(K number1, V number2){
        return number1.compareTo(number2);
    }
    
}
