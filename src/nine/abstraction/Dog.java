
package nine.abstraction;


public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Krećem se kao pas.");
    }

    @Override
    public void run() {
        System.out.println("Trčim kao pas.");
    }
    
}
