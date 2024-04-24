//RoomManagement.java
import javax.swing.*;
import java.util.ArrayList;

public class RoomManagement {
    public static void addRoom(ArrayList<Room> rooms) {
        try {
            int roomId = Integer.parseInt(JOptionPane.showInputDialog("Enter Room ID:"));
            String roomType = JOptionPane.showInputDialog("Enter Room Type:");
            int capacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Room Capacity:"));
            Room room = new Room(roomId, roomType, capacity);
            rooms.add(room);
            JOptionPane.showMessageDialog(null, "Room added successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input format. Please enter valid data.");
        }
    }
}
