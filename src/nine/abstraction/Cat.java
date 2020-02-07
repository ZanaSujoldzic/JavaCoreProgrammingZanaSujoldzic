
package nine.abstraction;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Krećem se kao mačka.");
    }

    @Override
    public void run() {
        System.out.println("Trčim kao mačka.");
    }
    
}
