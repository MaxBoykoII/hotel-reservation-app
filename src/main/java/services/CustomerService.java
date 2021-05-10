package services;

import models.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerService {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static Collection<Customer> getAllCustomers() {
        return customers;
    }

    public static void add_customer(String email, String firstName, String lastName) {
        Customer customer = new Customer(email, firstName, lastName);

        customers.add(customer);
    }

    public static Customer getCustomer(String customerEmail) {
        return customers.stream()
                .filter(customer -> customer.email == customerEmail)
                .findAny()
                .orElseGet(null);
    }
}
