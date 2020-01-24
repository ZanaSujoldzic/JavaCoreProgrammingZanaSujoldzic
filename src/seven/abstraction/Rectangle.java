
package seven.abstraction;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(int x, int y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Iscrtava se PRAVOUGAONIK");
     
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
    
}
