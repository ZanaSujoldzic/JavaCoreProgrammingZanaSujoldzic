
package four.loops;

import java.util.Scanner;

/**
 * Za razliku od WHILE petlje koja izvršava naredbu samo ukoliko ispunjava uslov, DO WHILE petlja bez obzira na uslov, uneseno ispisuje barem jednom, iako ne ispunjava uslov.
 * 
 * @author Zana
 */
public class DoWhileDemonstration {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        do{
            System.out.println("Printam count = " + count);
            count++;
        }while(count<11);
    }
    
}
