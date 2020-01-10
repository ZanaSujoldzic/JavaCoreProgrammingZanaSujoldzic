
package five;

/**
 // Operatori na nivou bita:
 // Bitwise OR -> |
 // Bitwise AND -> &
 // Bitwise XOR -> ^
 // Bitwise complement -> ~
  
 * @author Zana
 */
public class BitDemonstration {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111
        
        // Bitwise OR (0 i 1 daju 1, odnosno dovoljno je da je jedna 1, rezultat će biti 1)
        
        int res = a|b;
        System.out.println("a | b = " + res);
        
        // Bitwise AND (0 i 1 daju 0, odnosno uslov je da su obe 1 kako bi rezultat bio 1)
        
        int res1 = a&b;
        System.out.println("a & b = " + res1);
        
        // Bitwise XOR (ukoliko su bitovi različiti, rezultat je 1, ukoliko su isti, rezultat je 0)
        
        int res2 = a^b;
        System.out.println("a ^ b = " + res2);
        
        // Bitwise complement (vrši inverziju bitova kako bismo dobili "komplement jedinice",a zatim dodajemo 1 na rezultat i dobijemo "komplement dvojke")
        
        int res3 = ~a;
        System.out.println("a ~ b = " + res3);
        
        // u suštini, invertuje pozitivan broj u binarnom sistemu u negativni, dodaje mu 1, tako da dobijamo kao rezultat negativan broj uvećan za 1 od napisanog. npr. na 15 primijenjena tilda daje rezultat -16
        a = 15;
        res3 = ~a;
        System.out.println("~a = " + res3);
        
    }
}
