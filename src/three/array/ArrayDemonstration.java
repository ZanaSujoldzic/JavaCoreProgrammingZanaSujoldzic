
package three.array;

import java.util.Scanner;

/**
 * PRVI složeni tip podatka je NIZ.
 * označen sa []
 * Jedna varijabla može skladištiti više vrijednosti
 * 
 * @author Zana
 */
public class ArrayDemonstration {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 95;
        numbers[2] = 17;
        numbers[3] = 3;
        numbers[4] = 55;
        String message = "Ovo je niz brojeva. Vrijednost broja na polju " + numbers[3]+ " je 3.";
        System.out.println(message);
      
        
                
    }
}
