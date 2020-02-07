
package nine.abstraction.interfaces;

class Espresso implements Beverage {

    @Override
    public double cost() {
        return 2.0;
        
    }

    @Override
    public String getName() {
        return "Espresso";
    }

}
