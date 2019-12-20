
package three;

import java.util.Scanner;

/**
 * CONDITIONAL AND -> &&
 * CONDITIONAL OR -> ||
 * TERNARY IF -> ?
 * @author Zana
 */
public class ComparisonDemo1 {
    public static void main(String[] args) {
        System.out.println("Unesite Vaš prvi broj:");
        Scanner myScanner = new Scanner (System.in);
        int firstNumber = myScanner.nextInt();
        System.out.println("Unesite Vaš drugi broj:");
        int secondNumber = myScanner.nextInt();
        if ((firstNumber == 5) && (secondNumber == 7)){
            System.out.println("Prvi broj =" + firstNumber + ", a drugi broj =" + secondNumber); // ukoliko su svi uslovi jednaki, aplikacija će ispisati ovu liniju koda, ukoliko samo jedan nije - neće nikada
        }
        if ((firstNumber == 5) || (++secondNumber == 7)){ // ILI operator ne izvršava ovu naredbu nikad, ako je prvi uslov ispunjen, ako nije, onda će izvršiti inkrementaciju
            System.out.println("Prvi broj =" + firstNumber + ", a drugi broj =" + secondNumber); // dovoljno je da je ispunjen samo jedan uslov da bi se ispisala linija koda
        }
        System.out.println("Drugi uneseni broj u konačnici =" + secondNumber);
        
        boolean condition = firstNumber == secondNumber;
        String message = condition ? "Brojevi su jednaki.": "Brojevi nisu jednaki.";
        System.out.println(message); 
        
    }
}
