
package eight;

import java.util.Scanner;

public class SeasonTester {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        // System.out.println(season.getName());
        
        // Switch + enum
        
       // System.out.println("Unesite broj od 1 do 4:");
        
        //int numberInput = new Scanner(System.in).nextInt();
        
        //Season season1 = season.findSeasonByNumber(numberInput);
        
        System.out.println("Unesite naziv jednog godišnjeg doba");
        String nameInput = new Scanner(System.in).nextLine();
        Season season2 = season.findSeasonByName(nameInput);
        
        switch(season){
            case AUTMN:
                System.out.println("Lišće opada.");
                break;
            case SPRING:
                System.out.println("Sve cvjeta.");
                break;
            case SUMMER:
                System.out.println("Pješčana plaža, more..");
                break;
            case WINTER:
                System.out.println("Zimski sportovi.");
                break;
            default:
                System.out.println("Invalid month name");
            
        }
        
    }
    
}
