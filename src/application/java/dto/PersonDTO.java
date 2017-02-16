package application.java.dto;


public class PersonDTO {

    protected String lastName;
    protected String firstName;


    public PersonDTO() {
        firstName = "";
        lastName = "";
    }

    public PersonDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + lastName;
    }

}
