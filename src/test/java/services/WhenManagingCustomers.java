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
}
