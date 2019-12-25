
package three.array;

// Kopiranje vrijednosti iz niza u niz

import java.util.Arrays;

/**
 *
 * @author Zana
 */
public class ArrayCopyDemonstration {
    public static void main(String[] args) {
        
        // I način:
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n'};
        char[] copyTo = new char[8];
        System.out.println("Niz copyTo prije:" + new String(copyTo));
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println("Niz copyTo poslije:" + new String (copyTo));   
        
        // II način:
        
        char[] copyFrom1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n'};
        char[] copyTo1 = Arrays.copyOfRange(copyFrom1, 2, 10);
        System.out.println("Niz copyTo1 poslije:" + new String (copyTo1)); 
    }
}
