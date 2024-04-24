//CustomerRegistration.java
import javax.swing.*;
import java.util.ArrayList;

public class CustomerRegistration {
    public static void registerCustomer(ArrayList<Customer> customers) {
        String firstName = JOptionPane.showInputDialog("Enter First Name:");
        String lastName = JOptionPane.showInputDialog("Enter Last Name:");
        try {
            long mobileNumber = Long.parseLong(JOptionPane.showInputDialog("Enter Mobile Number:"));
            Customer customer = new Customer(firstName, lastName, mobileNumber);
            customers.add(customer);
            JOptionPane.showMessageDialog(null, "Customer registered successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid mobile number format. Please try again.");
        }
    }
}
