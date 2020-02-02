
package advanced.three;

import java.util.Scanner;

/**1. Kreirati klasu Person sa poljima (name, surname, ID)
 * Polja treba da budu privatna, a pristup poljima treba da bude kroz GET i SET metode
 * Konstruktor sa parametrima
 * toString() override
 *2. Kreirati klasu PersonConsoleReader
 * Korisnik definira vrijednosti polja klase Person
 * Nakon što korisnik unese sva polja, mi ih trebamo skladištiti (niz ili kontejner)
 * Iz konzole čita listu korisnika**/

// ZADAĆA: Ubaciti u try-catch-finally 

public class ThreeExecutor {
    public static void main(String[] args) {
        
        PersonConsoleReader consoleReader = new PersonConsoleReader();
        
        try{
            Person p1 = consoleReader.readPerson();
            System.out.println(p1);
        
        }
        catch(Exception e){
            System.out.println("Incorrect input.");
            
        }finally{
         
        }
    }
}
