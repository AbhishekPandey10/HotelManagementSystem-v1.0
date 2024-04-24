//StaffDisplay.java
import javax.swing.*;
import java.util.ArrayList;

public class StaffDisplay {
    public static void displayAllStaff(ArrayList<Staff> staff) {
        if (staff.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No staff members registered yet.");
            return;
        }

        StringBuilder staffList = new StringBuilder("Staff List:\n");
        for (Staff staffMember : staff) {
            staffList.append(staffMember.getName()).append(" (Role: ").append(staffMember.getRole()).append(")\n");
        }
        JOptionPane.showMessageDialog(null, staffList.toString(), "Staff", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void displaySpecificStaff(ArrayList<Staff> staff) {
        if (staff.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No staff members registered yet.");
            return;
        }

        int staffId = Integer.parseInt(JOptionPane.showInputDialog("Enter staff ID:"));

        boolean found = false;
        for (Staff staffMember : staff) {
            if (staffMember.getStaffId() == staffId) {
                JOptionPane.showMessageDialog(null, "Staff member found:\n" +
                        "Name: " + staffMember.getName() + "\n" +
                        "Role: " + staffMember.getRole());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Staff member not found.");
        }
    }
}
