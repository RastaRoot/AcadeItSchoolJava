package ClassAssignments;

public class Contact {
    private String lastName;
    private String firstName;
    private String numberPhone;

    public Contact (String lastName, String firstName, String numberPhone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.numberPhone = numberPhone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void print() {
        System.out.printf("%s %s %s%n", lastName, firstName, numberPhone);
    }
}