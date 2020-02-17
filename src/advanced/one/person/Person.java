
package advanced.one.person;

import java.time.LocalDate;
import java.time.Period;

public final class Person {
    
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender  gender;

    public Person(String name, String surname, LocalDate birthday, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }
    
    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age = period.getYears();
        return age;
        
    }
    
}
