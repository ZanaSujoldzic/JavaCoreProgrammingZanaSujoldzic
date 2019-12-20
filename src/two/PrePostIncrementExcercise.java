
package two;

/**
 *
 * @author Zana
 */
public class PrePostIncrementExcercise {
    public static void main(String[] args) {
        int a = 5, b = 7;
        int result = a * (b++) + b;// 5*7+8 = 43 -> prvo se izvršava množenje, zatim abiranje. S obzirom da je post increment, vrijednost b se povećava tek u sljedećoj varijabli "b"
        int result1 = a * (++b) + b; // 5*9+9 = 48 -> prvo se izvršava množenje, zatim sabiranje. Pre increment pa se vrijednost varijable "b" mijenja odmah, odnosno na prethodnu vrijednost 8 dodaje se plus 1, a u sljedećoj varijabli "b" se prepisuje.
        System.out.println(result);
        System.out.println(result1);
    }
}
