package services;

import models.Customer;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

public class WhenManagingCustomers {
    @Test
    public void should_return_a_default_customer_list() {
        Collection<Customer> customers = CustomerService.getAllCustomers();

        assertThat(customers).isEmpty();
    }

    @Test
    public void should_add_a_new_customer() {
        CustomerService.add_customer("example@email.com", "Bob", "Nobody");

        Customer customer = CustomerService.getCustomer("example@email.com");

        assertThat(customer).hasFieldOrPropertyWithValue("firstName", "Bob")
                .hasFieldOrPropertyWithValue("lastName", "Nobody")
                .hasFieldOrPropertyWithValue("email", "example@email.com");
    }
}
