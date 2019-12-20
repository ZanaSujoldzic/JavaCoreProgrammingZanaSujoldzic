
package two;

import java.util.Scanner;

/** Comparison operators:
 * == -> Equal to
 * != -> Not equal to
 * > -> greather than
 * >= -> greather or equal to
 * < -> less than
 * <= -> less or equal to
 *
 * @author Zana
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Molim Vas unesite prvi broj:");
        int userNumber = new Scanner (System.in).nextInt();
        System.out.println("Molim Vas unesite drugi broj:");
        int userNumber1 = new Scanner (System.in).nextInt();
        int result = userNumber + userNumber1;
        System.out.println("Zbir Vaših brojeva je =" + result);
        
        // IF - kontrola toka
        
        if (userNumber == userNumber1){
            System.out.println("Prvi broj jednak je drugom broju.");
        }
        if (userNumber != userNumber1){
            System.out.println("Prvi broj nije jednak drugom broju.");
        }
        if (userNumber > userNumber1){
            System.out.println("Prvi broj veći je od drugog broja.");
        }
        if (userNumber >= userNumber1){
            System.out.println("Prvi broj veći je ili jednak drugom broju.");
        }
        if (userNumber < userNumber1){
            System.out.println("Prvi broj manji je od drugog broja.");
        }
        if (userNumber <= userNumber1){
            System.out.println("Prvi broj manji je ili jednak drugom broju.");
        }
    }
}
