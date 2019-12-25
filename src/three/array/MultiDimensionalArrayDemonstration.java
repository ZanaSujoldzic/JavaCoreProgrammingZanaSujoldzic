
package three.array;

/**
 * Multidimenzionalni nizovi
 * Izmjena za GitHub
 * 
 * Matrica = "niz nizova"
 * označena sa [][]
 * @author Zana
 */
public class MultiDimensionalArrayDemonstration {
    public static void main(String[] args) {
    int[][] anArray = new int [3][3];
    anArray[0][0] = 57;
    anArray[0][1] = 3;
    anArray[0][2] = 23;
    anArray[1][0] = 17;
    anArray[1][1] = 5;
    anArray[1][2] = 96;
    anArray[2][0] = 35;
    anArray[2][1] = 753;
    anArray[2][2] = 7;
    
    for(int i = 0; i<anArray.length; i++){
        for(int j = 0; j<anArray[i].length; j++){
            System.out.print(anArray[i][j]+",");
            
        }
        System.out.println("");
    }
    }
}
