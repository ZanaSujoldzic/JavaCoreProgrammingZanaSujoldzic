
package five;

import java.util.Scanner;

/**
 *
 * @author Zana
 */
public class BreakWithLabel {
    public static void main(String[] args) {
        System.out.println("Unesite cijeli broj:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        int[][] dvodimenzionalniNiz = {
            {12, 36, 6, 85, 354},
            {3, 654, 891, 45852, 21, 2},
            {23, 6, 5, 96, 75}
        };
        
        boolean foundIt = false;
        int i;
        int j = 0;
        LABELA: for(i = 0; i<dvodimenzionalniNiz.length; i++ ){
            int[] niz = dvodimenzionalniNiz[i];
            for(j = 0; j<niz.length; j++){
                int var = niz[j];
                if(var == uneseniBroj){
                    foundIt = true;
                    break LABELA;
                    
                }
                System.out.println(var);
                }
                
            }
          if(foundIt){
                    System.out.println("Broj " + uneseniBroj + " je pronađen na poziciji [" + i + "," + j +"]");
                }else{
                    System.out.println("Broj nije pronađen.");  
        }
        
       
    }
    
}
