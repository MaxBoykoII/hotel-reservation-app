package unit.models;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingARoom {

    private Room room;
    private final double price = 225.0;
    private final int roomNumber = 5;

    @Before
    public void setup() {
        this.room = new Room(price, roomNumber);
    }

    @Test
    public void should_report_room_price() {
        double price = room.getRoomPrice();

        assertThat(price).isEqualTo(this.price);
    }

    @Test
    public void should_get_room_number() {
        int roomNumber = room.getRoomNumber();

        assertThat(roomNumber).isEqualTo(this.roomNumber);
    }
}
