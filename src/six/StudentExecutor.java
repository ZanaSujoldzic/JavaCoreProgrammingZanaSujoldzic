
package six;

import java.util.Arrays;


public class StudentExecutor {
    public static void main(String[] args) {
        Student s1 = new Student("Zana", "Sujoldžić", 4484);
        s1.studentInfo();
        Teacher t1 = new Teacher("Marija", "Šušić", " Veterinary medicine");
        t1.teacherInfo();
        
    Person[] personArray = new Person[2];
    personArray[0] = s1;
    personArray[1] = t1;
    
    // C++ petlja:
    
    for(int i = 0; i<personArray.length; i++){
       Person mutant = personArray[i];
        printPersonInfo(mutant);
       
    }
    
    // Enhanced for
    
    for(Person mutant : personArray){
        printPersonInfo(mutant);
        
    }
    
    // for each
    
    Arrays.asList(personArray).forEach(mutant->printPersonInfo(mutant));
    
    }
    private static void printPersonInfo (Person p){
        System.out.println("Name: " + p.name + ", Surname: " + p.surname);
    }
  
    
}
