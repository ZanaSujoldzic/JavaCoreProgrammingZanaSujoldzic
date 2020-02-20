
package advanced.two;

class ShadowTest {
    public static int counter = 0;
    public int x = 0;

    public ShadowTest() {
        counter++;
    }
    
    
    
    protected class FirstLevel{
        
        public int x = 1;
        
        public void printX(int x){
            System.out.println("X = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.x = " + ShadowTest.this.x);
        }
    }
    
    protected static class StaticFirstLevel{
        public int x = 2;
        
        public void printX(int x){
            System.out.println("X = " + x);
        }
    }
    
}
