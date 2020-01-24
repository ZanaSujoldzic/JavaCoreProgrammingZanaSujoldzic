
package seven;

public class Teacher extends Person {
    private String teachingArea;

    public Teacher(String name, String surname, String teachingArea) {
        super(name, surname);
        this.teachingArea = teachingArea;
    }

    public String getTeachingArea() {
        return teachingArea;
    }
    
    
    
}
