
package eight;

public class WeekDays {
    private int sequence;
    private String name;
    
    public WeekDays(int sequence, String name){
        this.sequence = sequence;
        this.name = name;
    }

    WeekDays(int i, WeekDays monday) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public int getSequence() {
        return sequence;
    }
     
}
