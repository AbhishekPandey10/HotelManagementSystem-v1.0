import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HotelManagementSystemGUI extends JFrame {
    private JPanel mainPanel = new JPanel(new GridLayout(4, 3, 10, 10));
    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static final ArrayList<Staff> staff = new ArrayList<>();
    private static final ArrayList<Room> rooms = new ArrayList<>();
    private static final ArrayList<Booking> bookings = new ArrayList<>();

    public HotelManagementSystemGUI() {
        setTitle("Hotel Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        addButtons();
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    private void addButtons() {
        mainPanel.add(createButton("Register Customer", e -> CustomerRegistration.registerCustomer(customers)));
        mainPanel.add(createButton("Register Staff", e -> StaffRegistration.registerStaff(staff)));
        mainPanel.add(createButton("Display All Customers", e -> CustomerDisplay.displayAllCustomers(customers)));
        mainPanel.add(createButton("Display Specific Customer", e -> CustomerDisplay.displaySpecificCustomer(customers)));
        mainPanel.add(createButton("Display All Staff", e -> StaffDisplay.displayAllStaff(staff)));
        mainPanel.add(createButton("Display Specific Staff", e -> StaffDisplay.displaySpecificStaff(staff)));
        mainPanel.add(createButton("Book Room", e -> RoomBooking.bookRoom(rooms, bookings)));
        mainPanel.add(createButton("Check Availability", e -> checkAvailability()));
        mainPanel.add(createButton("Display Booked Rooms", e -> BookingDisplay.displayBookedRooms(bookings)));
        mainPanel.add(createButton("Add Room", e -> RoomManagement.addRoom(rooms)));
        mainPanel.add(createButton("Display Available Rooms", e -> displayAvailableRooms()));
        mainPanel.add(createButton("Exit", e -> exitApplication()));
    }

    private JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        return button;
    }

    private void checkAvailability() {
        StringBuilder availableRooms = new StringBuilder("Available Rooms:\n");
        boolean foundAvailableRoom = false;
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.append("Room ID: ").append(room.getRoomId()).append("\n");
                foundAvailableRoom = true;
            }
        }
        if (foundAvailableRoom) {
            JOptionPane.showMessageDialog(this, availableRooms.toString(), "Available Rooms", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No rooms available for booking.", "Availability", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void displayAvailableRooms() {
        StringBuilder availableRooms = new StringBuilder("Available Rooms:\n");
        for (Room room : rooms) {
            availableRooms.append("Room ID: ").append(room.getRoomId())
                    .append(", Type: ").append(room.getRoomType())
                    .append(", Capacity: ").append(room.getCapacity())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(this, availableRooms.toString(), "Available Rooms", JOptionPane.INFORMATION_MESSAGE);
    }

    private void exitApplication() {
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the application?",
                "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HotelManagementSystemGUI::new);
    }
}
