package app;

import static org.apache.commons.lang3.StringUtils.repeat;

public class HotelReservationApp {
    public static void main(String [] args) {
        System.out.println("Welcome to the Hotel Reservation Application");
        System.out.println("\n");
        System.out.println(repeat("_", 50));
        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println(repeat("_", 50));
        System.out.println("Please select a number for the menu option");
        System.out.println(repeat("_", 50));
    }
}
