package models;

public class Customer {
    public final String email;
    public final String firstName;
    public  final String lastName;

    public Customer(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
