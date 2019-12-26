
package four;

import java.util.Scanner;

public class SwitchDemonstration1 {
    public static void main(String[] args) {
        System.out.println("Unesite ime mjeseca da saznate koji je mjesec po redu:");
        String monthName = new Scanner(System.in).nextLine();
        int monthNumber;
        switch(monthName.toLowerCase()){
            case "januar": 
                monthNumber = 1;
                break;
            case "februar":
                monthNumber = 2;
                break;
            case "mart":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "maj":
                monthNumber = 5;
                break;
            case "juni":
                monthNumber = 6;
                break;
            case "juli":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "septembar":
                monthNumber = 9;
                break;
            case "oktobar":
                monthNumber = 10;
                break;
            case "novembar":
                monthNumber = 11;
                break;
            case "decembar":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;     
        }
        if(monthNumber == 0){
            System.out.println("Nepostojeći mjesec u godini = " + monthName);
        }else{
            System.out.println("Broj mjeseca u godini je = " +monthNumber);
        }
    }
    
}
