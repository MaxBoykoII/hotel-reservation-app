package models;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingARoom {

    private Room room;

    @Before
    public void setup() {
        this.room = new Room(225.0, 5);
    }

    @Test
    public void should_report_room_price() {
        double price = room.getRoomPrice();

        assertThat(price).isEqualTo(225.0);
    }

    @Test
    public void should_get_room_number() {
        int roomNumber = room.getRoomNumber();

        assertThat(roomNumber).isEqualTo(5);
    }
}
