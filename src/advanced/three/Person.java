
package advanced.three;

import java.time.LocalDate;

public class Person {
    public static int counter = 0;
    private final int id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;

    public Person(int id, String name, String surname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        sb.append(" Birthday: ");
        sb.append(birthday);
        //String textRepresentPerson = name + " " + surname + " " + birthday.toString();
        //return textRepresentPerson;
        return sb.toString();
    }
    
}
