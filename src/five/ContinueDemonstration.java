
package five;

import java.util.Scanner;

public class ContinueDemonstration {
    public static void main(String[] args) {
        System.out.println("Unesite jedno slovo:"); // Ukoliko unesemo rečenicu, aplikacija će uzeti samo prvo slovo iz rečenice
        char letter = new Scanner(System.in).nextLine().charAt(0);
        String text = "Ljudi se ustvari boje, zato su surovi. Meša Selimović";
        int repeatNumber = 0;
        char[] characterArray = text.toCharArray();
        for(int i = 0; i<characterArray.length; i++){
            char oneLetter = characterArray[i];
            
            if(oneLetter != letter){
                continue;           
            }
            repeatNumber++;
                   
        }
        System.out.println("Uneseno slovo '" + letter + "' se pojavljuje " + repeatNumber + " puta.");
        
    }
    
}
