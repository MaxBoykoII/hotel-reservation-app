package models;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingARoom {

    @Test
    public void should_report_room_price() {
        Room room = new Room();

        double price = room.getRoomPrice();

        assertThat(price).isEqualTo(225.0);
    }
}
