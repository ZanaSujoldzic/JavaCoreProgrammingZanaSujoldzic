
package five;

import java.util.Scanner;

/**
 *
 * @author Zana
 */
public class BreakDemonstration {
    public static void main(String[] args) {
        System.out.println("Unesite cijeli broj:");
        Scanner mojScanner = new Scanner(System.in);
        int searchFor = mojScanner.nextInt();
        int[] numbers = {5, 87, 9, 236, 87, 32, 15, 95, 254, 1569};
        boolean foundIt = false;
        for (int i=0; i<numbers.length; i++){
            int mutant = numbers[i];
            if(mutant == searchFor){
                foundIt = true;
                break;
            }
            System.out.println(mutant);    
        }
      
        String message = foundIt ? "Pronađen broj u nizu": "Nije pronađen broj u nizu";
        System.out.println(message);
        
    }
    
}
