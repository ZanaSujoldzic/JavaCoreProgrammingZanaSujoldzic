
package three.array;

// Multidimenzionalni nizovi

public class MultiDimensionalArrayDemo1 {
    public static void main(String[] args) {
        String[][] nameSurnameArray = {
            {"Zana", "Eleonora", "Sujoldžić"},
            {"Amen", "Topčić"},
            {"Omar", "Topčić"},
                
        };
        System.out.println(nameSurnameArray[0][0]+" "+nameSurnameArray[0][1]+" "+nameSurnameArray[0][2]);
        
        String[] array = nameSurnameArray[2];
        System.out.println(array.length);
    }
    
}
