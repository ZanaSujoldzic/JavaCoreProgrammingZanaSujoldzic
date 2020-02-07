
package nine.abstraction.interfaces;


class Milk implements Beverage{

    @Override
    public double cost() {
       return 1.01;
    }

    @Override
    public String getName() {
        return "Milk";
    }
    
}
