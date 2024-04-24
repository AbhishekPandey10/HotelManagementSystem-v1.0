//BookingDisplay.java
import javax.swing.*;
import java.util.ArrayList;

public class BookingDisplay {
    public static void displayBookedRooms(ArrayList<Booking> bookings) {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No rooms have been booked yet.");
            return;
        }

        StringBuilder bookedRooms = new StringBuilder("Booked Rooms:\n");
        for (Booking booking : bookings) {
            bookedRooms.append("Room ID: ").append(booking.getRoom().getRoomId())
                    .append(", Customer: ").append(booking.getCustomer().getFirstName()).append(" ")
                    .append(booking.getCustomer().getLastName())
                    .append(", Check-In: ").append(booking.getCheckInDate())
                    .append(", Check-Out: ").append(booking.getCheckOutDate())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, bookedRooms.toString(), "Booked Rooms", JOptionPane.INFORMATION_MESSAGE);
    }
}
