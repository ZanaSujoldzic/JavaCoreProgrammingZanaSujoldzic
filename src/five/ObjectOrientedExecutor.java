
package five;

// Složeni (objektni) tip podataka

public class ObjectOrientedExecutor {
    public static void main(String[] args) {
        
        // Prvi objektni tip podatka koji smo uveli bio je niz
        
        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 98;
        numbers[2] = 12;
        
        // Ograničenje nizova je to što svi podaci unutar niza moraju biti istog tipa i niz je ograničen
        
        Person p1 = new Person();
        p1.name = "Zana";
        p1.surname = "Sujoldzic";
        p1.age = 26;
        p1.bankAccountAmount = 158612.0;
        
        // Zatim po istoj klasi "Person" možemo kreirati novi objekat
        
        Person p2 = new Person();
        p2.name = "Amen";
        p2.surname = "Topcic";
        p2.age = 11;
        p2.bankAccountAmount = 25654.0;
        
        // POLJA nizova su INDEKSIRANA, a POLJA klase su IMENOVANA i ona su jedinstvena
        
         // Kada poredimo proste tipove koristimo operator ==, a kada poredimo stringove koristimo .equals jer operator == poredi memorijski prostor, a ne vrijednosti
         
         String text = new String("Poredjenje");
         String text1 = "Poredjenje";
         boolean poredjenje = text == text1;
         System.out.println(poredjenje);
         boolean poredjenje1 = text.equals(text1);
         System.out.println(poredjenje1);
         
         // Najbolje je koristiti STRING LITERAL, ali ukoliko string pozivamo uz pomoć konstruktora dodajemo nastavak .intern(); kako bismo sve skladištili u isti memorijski prostor
        
        
    }
    
}
