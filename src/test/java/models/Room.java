package models;

public class Room {

    private final double price;

    public Room(double price)  {
        this.price = price;
    }
    public double getRoomPrice() {
        return this.price;
    }
}
