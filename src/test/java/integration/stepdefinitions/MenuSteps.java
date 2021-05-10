package integration.stepdefinitions;

import app.HotelReservationApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {
    private ByteArrayOutputStream bytes;

    @Given("Rusty opens the hotel reservation application")
    public void rusty_opens_the_hotel_reservation_application() {
        bytes = new ByteArrayOutputStream();
        PrintStream console = System.out;

        System.setOut(new PrintStream(bytes));
        HotelReservationApp.main();

        System.setOut(console);
    }

    @Then("Rusty will be welcomed")
    public void rusty_will_be_welcomed() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(bytes.toString()).contains("Welcome to the Hotel Reservation Application");
    }

    @Then("Rusty will see a list of actions he can take")
    public void rusty_will_see_a_list_of_actions_he_can_take() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(bytes.toString())
                .contains("1. Find and reserve a room")
                .contains("2. See my reservations")
                .contains("3. Create an account")
                .contains("4. Admin")
                .contains("5. Exit");
    }

    @Then("Rusty will be prompted to select a menu option")
    public void rusty_will_be_prompted_to_select_a_menu_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
