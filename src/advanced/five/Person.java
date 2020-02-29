
package advanced.five;


public class Person implements Comparable<Person>{
    private final int id;
    private final String name;
    private final String surname;
    private final String adress;
    private final String city;

    public Person(int id, String name, String surname, String adress, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.city = city;
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

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ,");
        sb.append(surname);
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
       int result = this.name.compareTo(o.getName());
       if(result == 0){
           result = this.surname.compareTo(o.surname);
       }
       return result;
    }
    
    
    
}
