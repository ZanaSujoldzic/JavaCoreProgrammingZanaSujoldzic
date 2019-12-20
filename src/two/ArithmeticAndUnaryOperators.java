
package two;

/** ArithmeticAndUnaryOperators in Java:
 ASSIGNMENT operator = -> operator dodjele
 * ARITHMETIC operators:
 * -> additive +
 * -> subtraction -
 * -> multiplication *
 * -> divide /
 * -> modulo % -> "ostatak od dijeljenja"
 * 
 * UNARY operators:
 * +; -;
 * ++ -> INCREMENT (preincrement ++number), (postincrement number++)
 * -- -> DECREMENT (predecrement --number), (postdecrement number--)
 * ! - > LOGIC COMPLEMENT -> "inverzija"
 * @author Zana
 */
public class ArithmeticAndUnaryOperators {
    public static void main(String[] args) {
        //Arithmetic operators:
        
        System.out.println("Aritmetički operatori");
        
        int number1 = 57, number2 = 32;
        int result = number1 + number2;
        System.out.println(result);
        
        int res = 897 - 654;
        System.out.println(res);
        
        res = res *2; 
        System.out.println(res);
        
        res = res / 2;
        System.out.println(res);
        
        res = res % 2;
        System.out.println(res);
        
        System.out.println("Unarni operatori");
        
        //Unary operators:
        
        // + -> plus
        // - -> minus
        // ++ -> increment - "uvećava" vrijednost za 1
        // -- -> decrement - "umanjuje vrijednost za 1
        
        int number = 57;
        number++; // post increment
        System.out.println(number);
        ++number; //pre increment
        System.out.println(number);
        System.out.println(++number); // -> u ovoj liniji koda ODMAH računa i ispisuje novu vrijednost. PRE!
        System.out.println(number++); // -> u sljedećoj liniji koda ispisuje novu vrijednost. POST
        System.out.println(number);
        
        System.out.println(--number); // pre decrement
        System.out.println(number--); // post decrement
        System.out.println(number);
        
        boolean message = true;
        System.out.println(message);
        System.out.println(!message);
    }
 
}
