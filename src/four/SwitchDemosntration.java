
package four;

// < Java.7 - samo integer vrijednosti ili nešto što je konvertibilno u integer

import java.util.Scanner;

public class SwitchDemosntration {
    public static void main(String[] args) {
        System.out.println("Unesite broj mjeseca kako biste saznali naziv mjeseca na Engleskom jeziku:");
        int monthNumber = new Scanner(System.in).nextInt();
        String monthName;
        switch(monthNumber){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5: 
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12: 
                monthName = "December";
                break;
            default: 
                monthName = "Invalid month";
                break;
        }
        System.out.println(monthName);
    }
    
}
