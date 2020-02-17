
package advanced.one.person;


public enum Gender {
    
    FEMALE("Ženski rod"),
    MALE("Muški rod");
    
    private String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    
}
