// Represents a person with a name and an address

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // toString method
    public String toString() {
        return lastName + " " + firstName + ", " + address;
    }
}
