
package advanced.two;

import java.util.ArrayList;
import java.util.List;
import seven.abstraction.Circle;
import seven.abstraction.Shape;


public class CollectionExecutor {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        Box<Shape> box = new Box<>();
        box.set(new Circle(0, 0, 3.0));
        Shape shape = box.get();
    }
    
}
