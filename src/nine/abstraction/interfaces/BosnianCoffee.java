
package nine.abstraction.interfaces;


class BosnianCoffee implements Beverage{

    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getName() {
        return "Bosanska kafa";
       
    }
    
}
