
package nine.abstraction.interfaces;

public interface Beverage {
    public static final int COUNTER = 12;
    
    public abstract double cost();
    
    String getName();
    
    default void drink(String...params){
            drink();
    }
    
    public static void staticMethod(){
        System.out.println("Poziv iz javno dostupne statičke metode interfejsa.");
    }
}
