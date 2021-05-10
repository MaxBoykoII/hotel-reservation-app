package integration.stepdefinitions;

import app.HotelReservationApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

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
        HotelReservationApp.main(null);

        System.setOut(console);
    }

    @Then("Rusty will be welcomed")
    public void rusty_will_be_welcomed() {
        assertThat(bytes.toString()).contains("Welcome to the Hotel Reservation Application");
    }

    @Then("Rusty will see a list of the following actions:")
    public void rusty_will_see_a_list_of_the_following_actions(DataTable dataTable) {
        dataTable.asList().forEach(action ->
                assertThat(bytes.toString()).contains(action));
    }

    @Then("Rusty will be prompted to select a menu option")
    public void rusty_will_be_prompted_to_select_a_menu_option() {
       assertThat(bytes.toString())
               .contains("Please select a number for the menu option");
    }
}
