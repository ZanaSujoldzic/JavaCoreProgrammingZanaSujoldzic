
package three.control;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfElseIfDemonstration {
    public static void main(String[] args) {
        // konzolni unos vrijednosti
        
        // System.out.println("Molim Vas unesite broj bodova dobijenih na ispitu:");
        // int score = new Scanner(System.in).nextInt();
        
        // ili
        
        String unesenaOcjena = JOptionPane.showInputDialog("Molim Vas unesite broj bodova dobijenih na ispitu:");
        int score = Integer.parseInt(unesenaOcjena);
                
        char grade;
        if(score>=95){
            grade = 'A';
        }else if(score>=85){
            grade = 'B';
        }else if(score>=75){
            grade = 'C';
        }else if(score>=65){
            grade = 'D';
        }else if(score>=55){
            grade = 'E';
        }else{
           grade = 'F' ;
        }
        System.out.println("Vaš broj bodova zadovoljava ocjenu " + grade);    }
    
}
