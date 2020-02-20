
package advanced.two;

public class TwoExecutor {
    public static void main(String[] args) {
        
        ShadowTest shadowTest = new ShadowTest();
        System.out.println(shadowTest.x);
        System.out.println(ShadowTest.counter);
        
        //Kreiranje objekta po šablonu nestatičke INNER klase
        ShadowTest.FirstLevel firstLevelObject = shadowTest.new FirstLevel();
        
        //Kreiranje objekta po šablonu statičke INNER klase
        ShadowTest.StaticFirstLevel statitFirstLevelOvbject = new ShadowTest.StaticFirstLevel();
        
        firstLevelObject.printX(23);
    }
    
}
