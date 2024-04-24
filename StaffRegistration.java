//StaffRegistration.java
import javax.swing.*;
import java.util.ArrayList;

public class StaffRegistration {
    public static void registerStaff(ArrayList<Staff> staff) {
        try {
            int staffId = Integer.parseInt(JOptionPane.showInputDialog("Enter Staff ID:"));
            String name = JOptionPane.showInputDialog("Enter Staff Name:");
            String role = JOptionPane.showInputDialog("Enter Staff Role (e.g., Manager, Receptionist):");
            Staff staffMember = new Staff(staffId, name, role);
            staff.add(staffMember);
            JOptionPane.showMessageDialog(null, "Staff member registered successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Staff ID format. Please enter a valid integer.");
        }
    }
}
