
package six;

public class Teacher extends Person {
    public String fieldOfInterest;
    
    public Teacher(String name, String surname, String fieldOfInterest) {
        super(name, surname);
        this.fieldOfInterest = fieldOfInterest;
    }
    
    public void teacherInfo(){
        System.out.println("Name: " + name + ", Surname: " + surname + ", Field of interest:" + fieldOfInterest);
    }
  
    
}
