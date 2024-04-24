// RoomBooking.java
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RoomBooking {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void bookRoom(ArrayList<Room> rooms, ArrayList<Booking> bookings) {
        if (rooms.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No rooms available for booking.");
            return;
        }

        // Display available rooms
        StringBuilder roomOptionsBuilder = new StringBuilder("Available Rooms:\n");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                roomOptionsBuilder.append("Room ID: ").append(room.getRoomId())
                        .append(", Type: ").append(room.getRoomType())
                        .append(", Capacity: ").append(room.getCapacity())
                        .append("\n");
            }
        }
        String[] roomOptions = roomOptionsBuilder.toString().split("\n");
        String selectedRoom = (String) JOptionPane.showInputDialog(null, "Select a room to book:", "Book Room",
                JOptionPane.PLAIN_MESSAGE, null, roomOptions, roomOptions[0]);

        if (selectedRoom == null) {
            return; // User canceled booking
        }

        // Extract room ID from selectedRoom string
        int roomId = Integer.parseInt(selectedRoom.split(":")[1].trim());

        // Find the room object corresponding to the selected room ID
        Room selectedRoomObj = null;
        for (Room room : rooms) {
            if (room.getRoomId() == roomId) {
                selectedRoomObj = room;
                break;
            }
        }

        // Ask for customer details
        String firstName = JOptionPane.showInputDialog("Enter Customer First Name:");
        String lastName = JOptionPane.showInputDialog("Enter Customer Last Name:");
        long mobileNumber = 0;
        boolean validMobileNumber = false;
        while (!validMobileNumber) {
            try {
                mobileNumber = Long.parseLong(JOptionPane.showInputDialog("Enter Customer Mobile Number:"));
                validMobileNumber = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid mobile number format. Please try again.");
            }
        }

        // Create customer object
        Customer customer = new Customer(firstName, lastName, mobileNumber);

        // Ask for check-in and check-out dates
        Date checkInDate = getValidDateInput("Enter Check-In Date (YYYY-MM-DD): ");
        Date checkOutDate = getValidDateInput("Enter Check-Out Date (YYYY-MM-DD): ");

        // Create booking object
        Booking booking = new Booking(selectedRoomObj, customer, checkInDate, checkOutDate);

        // Update room availability
        selectedRoomObj.setAvailable(false);

        // Add booking to bookings list
        bookings.add(booking);

        JOptionPane.showMessageDialog(null, "Room booked successfully!");
    }

    private static Date getValidDateInput(String message) {
        while (true) {
            try {
                String dateStr = JOptionPane.showInputDialog(message);
                return dateFormat.parse(dateStr);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Please try again.");
            }
        }
    }
}
