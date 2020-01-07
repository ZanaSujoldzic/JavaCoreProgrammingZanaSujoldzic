
package four.loops;

import java.util.Scanner;

/**
 * WHILE (izraz čiji rezultat mors biti true ili false){
 * -> Blok koda koji se izvršava sve dok je zadovoljen uslov petlje
 * 
 * }
 *
 * @author Zana
 */
public class WhileDemonstration {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        while(count<11){
            System.out.println("Printam count = " + count);
            count++;
        }
                
    }
    
}
