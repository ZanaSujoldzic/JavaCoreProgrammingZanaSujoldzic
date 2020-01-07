
package four.loops;

import java.util.Scanner;

/**
 * for(početni uslov; uslov petlje; korak petlje){
 * 
 * }
 *
 * @author Zana
 */
public class ForDemonstration{
       public static void main(String[] args) {
       for(int count = new Scanner(System.in).nextInt(); count<11; count++){
           System.out.println("Printam count = " + count);
}
       
       // Beskonačna petlja
       
       for( ; ; ){
           System.out.println("Ja sam u beskonačnoj petlji");
       }
       }
}

// Ukoliko želimo da nam je varijabla vidljiva van petlje onda je ne upisujemo u početni uslov nego prije petlje;
// npr. int count = new Scanner(System.in).nextInt();
// A, početni uslov petlje ostavljamo prazan (for( ; uslov; korak petlje;))