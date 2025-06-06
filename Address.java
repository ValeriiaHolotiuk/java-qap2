// Represents a mailing address with street, city, state, and zip code

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method
    public String toString() {
        return street + ", " + city + ", " + state + "\n" + zip;
    }
}
