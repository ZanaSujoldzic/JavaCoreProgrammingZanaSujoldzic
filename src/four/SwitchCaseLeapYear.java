
package four;

import java.util.Scanner;

// Računanje prestupne godine

public class SwitchCaseLeapYear {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Unesite broj mjeseca:");
        int monthNumber = myScanner.nextInt();
        System.out.println("Unesite broj godine:");
        int yearNumber = myScanner.nextInt();
        int daysInMonth = 0;
        switch(monthNumber){
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10:  
            case 12:
             daysInMonth = 31;
             break;
            case 4: 
            case 6: 
            case 9: 
            case 11:
             daysInMonth = 30;
             break; 
            case 2:
                if((yearNumber%4 == 0 && yearNumber%100 != 0) || (yearNumber%400 == 0)){
                    daysInMonth = 29;
                }else{
                    daysInMonth = 28;
                }
                break;
                  
            default:
                System.out.println("Invalid month number.");
                break; 
                
        }
        System.out.println("Number of days in month = " + daysInMonth);
    }
    
}
