
package one;

/** TIPOVI PODATAKA U JAVI:
 * Prosti ili primitivni:
 * byte (8 bit) 
 * short (16 bit)
 * int (32 bit) - Integer
 * long (64 bit) - jedini koji se izvršava s lijeva na desno i iz tog razloga nakon dodijeljene vrijednosti ovom tipu podatka na kraj se dodaje malo ili veliko slovo "L"
 * float (32 bit) - na kraj malo ili veliko slovo "F"
 * double (64 bit) - podrazumijevana decimalna vrijednost u Javi
 * boolean (8 bit) - podatak koji podržava "true" or "false" vrijednosti
 * char (16 bit) - upisuje se vrijednost u ' ' - Character; ASCII table
 *
 * 2. Složeni ili objektni
 * 
 * 
 * @author Zana
 */
public class DataTypes {
    public static void main(String[] args) {
        byte byteVariable = 127; // 2^(8) = 256, odnosno od - 128 do 127.
        short shortVariable = 32767; // 2^(16) = 65536, odnosno od - 32768 do 32767.
        int intVariable = 2147483647; // 2^(32) = 4294967296
        long longVariable = 922337204025L;// 2^(64) = 184467441E+19
        float floatVariable = 0.085F; // 2^(32)
        double doubleVariable = 15.654; // 2^(64)
        boolean booleanVariable = true; // 
        char charVariable = 'B'; //
        
        System.out.println(byteVariable);
        System.out.println(shortVariable);  
        System.out.println(intVariable);
        System.out.println(longVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);
        System.out.println(booleanVariable);
        System.out.println(charVariable);
    }
}
