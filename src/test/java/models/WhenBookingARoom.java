package models;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingARoom {

    @Test
    public void should_report_room_price() {
        Room room = new Room(225.0, 5);

        double price = room.getRoomPrice();

        assertThat(price).isEqualTo(225.0);
    }

    @Test
    public void should_get_room_number() {
        Room room = new Room(225.0, 5);

        int roomNumber = room.getRoomNumber();

        assertThat(roomNumber).isEqualTo(5);
    }
}
