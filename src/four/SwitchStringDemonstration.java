
package four;

import javax.swing.JOptionPane;

// >= 1.7 Java SE

// .toLowerCase - jer je Java "case sensitive"

public class SwitchStringDemonstration {
    public static void main(String[] args) {
        String weekName = JOptionPane.showInputDialog("Unesi ime dana u sedmici na Engleskom jeziku da saznaš prijevod:");
        switch(weekName.toLowerCase()){
            case "monday":
                System.out.println("Ponedjeljak");
                break;
            case "tuesday":
                System.out.println("Utorak");
                break;
            case "wednesday":
                System.out.println("Srijeda");
                break;
            case "thursday":
                System.out.println("Četvrtak");
                break;
            case "friday":
                System.out.println("Petak");
                break;
            case "saturday":
                System.out.println("Subota");
                break;
            case "sunday":
                System.out.println("Nedjelja");
                break;
            default: 
                System.out.println("Unio si pogrešan naziv.");
                break;
        
                
                
        }
    }
    
}
