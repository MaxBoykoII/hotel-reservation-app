package unit.models;

public class Room {

    private final double price;
    private final int roomNumber;

    public Room(double price, int roomNumber)  {
        this.price = price;
        this.roomNumber = roomNumber;
    }
    public double getRoomPrice() {
        return this.price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
