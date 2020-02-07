
package nine.abstraction.interfaces;


public class MilkDecorator implements Beverage{
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
        
    
        @Override
    public double cost() {
        return beverage.cost()+0.5;
    }

    @Override
    public String getName() {
       return "s mlijekom";
    }
    
    
    
    }

