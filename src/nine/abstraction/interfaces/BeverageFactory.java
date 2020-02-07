

package nine.abstraction.interfaces;


public enum BeverageFactory {
    ESPRESSO(new Espresso()),
    MILK(new Milk()),
    TEA(new Tea()),
    COCA_COLA(new CocaCola()),
    BOSNIAN_COFFEE(new BosnianCoffee());
    
    private Beverage beverage;

    private BeverageFactory(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage produceBeverage() {
        return beverage;
    }
   
    
}
