
package eight;

public enum WeekDayEnum {
    
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday");
    
    
    
    // može imati i objektna i statička polja
    
    private int sequence;
    private String name;
    
    // konstruktor

    private WeekDayEnum(int sequence, String name) {
        this.sequence = sequence;
        this.name = name;
    }
    
    // funkcije

    public String getName() {
        return name;
    }

    public int getSequence() {
        return sequence;
    }
    
    
    
    
    
}
