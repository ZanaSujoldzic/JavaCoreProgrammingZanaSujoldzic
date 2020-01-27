
package eight;

public enum Season {
    SPRING(1, "Proljeće"),
    SUMMER(2, "Ljeto"),
    AUTMN(3, "Jesen"),
    WINTER(4, "Zima");
    
    private int number;
    private String name;
    
    private Season(int number, String name){
        this.number = number;
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
    
   
    
}
