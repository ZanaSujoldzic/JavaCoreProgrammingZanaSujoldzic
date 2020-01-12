
package five;

import java.util.Scanner;

public class ContinueWithLabelDemonstration {
    public static void main(String[] args) {
        System.out.println("Unesite neku riječ:");
        String word = new Scanner(System.in).nextLine().toLowerCase();
        String text = "Ljudi se ustvari boje, zato su surovi. Mesa Selimovic";
        // int max = text.length()-word.length(); ili:
        int wordLenght = word.length();
        int textLenght = text.length();
        int max = textLenght-wordLenght;
        int i;
        int j;
        boolean foundIt = false;
        LABELA: for(i = 0; i<=max; i++){
            int counter = i;
            
            
            for(j = 0; j<word.length(); j++){
                char textLetter = text.charAt(counter);
                counter++;
                char wordLetter = word.charAt(j);
                if(wordLetter != textLetter){
                    continue LABELA;
                }
                
            }
            
            foundIt = true;
            break;
            
        }
                
        System.out.println(foundIt ? "Riječ je pronađena." : "Riječ nije pronađena."); 
    }
    
}
