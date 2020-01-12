
package tasks;

// Zadatak 1 - .pdf prezentacija broj 1
// Ispraviti kod tako da ne pokazuje greške

public class FirstHomework {
    public static void main(String[] args) {
        // Initializing variables here: -> 1. greška - komentar se piše sa //
        int x = 25, y = 35, z = 45;
        int[] currentPostition = {x,y,z}; // -> 2. greška, otvorena zagrada mora se i zatvoriti
        System.out.println("Your current position is: "); // -> 3. greška, ; se stavljaju na kraju svake ispisane linje koda
        System.out.printf("x: %d, y: %d, z: %d/n", currentPostition[0], currentPostition[1], currentPostition[2]); // 4. greška, jednaka kao i 3. greška
        
    }
    
}
