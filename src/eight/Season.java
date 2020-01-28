
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
    
    public static Season findSeasonByNumber(int number){
        Season[] seasons = Season.values();
        Season season = null;
        for(int i = 0; i<seasons.length; i++){
            Season mutant = seasons[i];
            if(mutant.getNumber() == number){
                season = mutant;
                break;
                
            }
            
        }
        
        return season;
    }
    
   public static Season findSeasonByName(String name){
       Season[] seasons = Season.values();
       for(Season season : seasons){
           if (season != null && season.getName().toLowerCase().equals(name.toLowerCase())){
               return season;
           }
       }
       return null;
   }
    
}
