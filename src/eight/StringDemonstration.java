
package eight;

import javax.swing.JOptionPane;

// Konvertovanje vrijednosti tipa String u vrijednosti tipa Number (integer, float..)

// Jedan od razloga postojanja omotača prostih tipova (Autobi+oxing) jeste upravo konverzija

public class StringDemonstration {
    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Unesite cijeli broj:");
        int numberInputConverted = Integer.parseInt(numberInput);
        System.out.println("Konvertovani input iz User interface-a = " + numberInputConverted);
        String floatInput = JOptionPane.showInputDialog("Unesite decimalni broj:");
        float floatInputConverted = Float.parseFloat(floatInput);
        System.out.println("Konvertovani input iz User interface-a = " + floatInputConverted);
        
        // POREĐENJE Strinogva
        
        String name = new String ("Zana");
        String name1 = new String ("Luka");
        
        System.out.println(name == name1); // poredi MEMORIJSKE lokacije, odnosno reference i zbog toga se ne koristi kod poređenja objektnih tipova podataka
        
        if(name.equals(name1)){
            System.out.println("Imena su jednaka.");
        }else{
            System.out.println("Imena nisu jednaka");
        }
        
        // POREĐENJE String literal-a
        
        String name2 = "Zana";
        String name3 = "Zana";
        
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
        
        // ILI, ukoliko je dodjela String vrijednosti izvršena uz pomoć konstruktora možemo dodati .intern() kako bismo uštedili memoriju, odnosno skladištili vrijednosti na istoj memorijskoj lokaciji
        
        String name4 = new String ("Amen").intern();
        String name5 = new String ("Amen").intern();
        
        System.out.println(name4==name5);
        
    }
    
}
