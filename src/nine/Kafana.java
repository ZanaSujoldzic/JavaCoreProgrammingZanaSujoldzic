
package nine;

import nine.abstraction.interfaces.Beverage;
import nine.abstraction.interfaces.BeverageFactory;
import nine.abstraction.interfaces.MilkDecorator;

public class Kafana {
    public static void main(String[] args) {
        
       Beverage espresso = BeverageFactory.ESPRESSO.produceBeverage();
        System.out.println(espresso.getName());
        Kafana kafana = new Kafana();
       Beverage bosanskaKafa = BeverageFactory.BOSNIAN_COFFEE.produceBeverage();
       kafana.drinkingBeverage(bosanskaKafa);
       Beverage coffee = new MilkDecorator(espresso);
       kafana.drinkingBeverage(coffee);
      
        
    } 
    
    private BeverageFactory beverageFactory;
    
    void drinkingBeverage(Beverage beverage){
        System.out.println("Pijem piće: " + beverage.getName() + " i to me košta: " + beverage.cost());
    }
}
