
package four.loops;

/**
 *
 * @author Zana
 */
public class ForDemonstration1 {
    public static void main(String[] args) {
        int[] numbers = {1, 58, 98, 54, 75, 30, 7, 25, 265, 5489};
        
        // naslijeđena petlja iz C++
        
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Element na indeksu '" + i + "' = " + numbers[i]);  
                       
        }
        
        // enhanced for loop
        
        for(int mutant : numbers){
            System.out.println(mutant);
        }
    }
}
