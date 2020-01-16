
package six;

public class Student extends Person {
    private int indexNumber;
    
    public Student(String name, String surname, int indexNumber) {
        super(name, surname);
        this.indexNumber = indexNumber;
    }
  public int getIndexNumber(){
      return indexNumber;
  }
  public void studentInfo(){
      System.out.println("Name: " + name + " Surname: " + surname + " Index number: " + indexNumber);
  }
}
