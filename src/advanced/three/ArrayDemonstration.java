package advanced.three;

import java.util.Scanner;

public class ArrayDemonstration {

    public static void main(String[] args) {
        String korisnickiUnos = "Zana Sujoldzic 1993/3/11";
        String[] polja = korisnickiUnos.split(" ");
        // System.out.println(polja[3]); //Greška programera
        System.out.println("TEST"); // Ukoliko postoji gornja greška, ovaj kod se neće ispisati
        //< 1.7
        Scanner scanner = null;
        // TRY - CATCH - FINALLY - uvijek se treba koristiti sa čitanje i pisanjem u neke dokumente
        try {
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }

        }

    }
}
