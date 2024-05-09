package Day5;

public class Address {

    private String street;
    private String city;
    private String state;
    private int pin;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Address(String street, String city, int pin, String state) {
        this.street = street;
        this.city = city;
        this.pin = pin;
        this.state = state;
    }
}
