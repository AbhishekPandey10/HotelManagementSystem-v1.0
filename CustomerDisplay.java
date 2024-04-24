//CustomerDisplay.java
import javax.swing.*;
import java.util.ArrayList;

public class CustomerDisplay {
    public static void displayAllCustomers(ArrayList<Customer> customers) {
        if (customers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No customers registered yet.");
            return;
        }

        StringBuilder customerList = new StringBuilder("Customer List:\n");
        for (Customer customer : customers) {
            customerList.append(customer.getFirstName()).append(" ").append(customer.getLastName())
                    .append(", Mobile: ").append(customer.getMobileNumber()).append("\n");
        }
        JOptionPane.showMessageDialog(null, customerList.toString(), "Customers", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void displaySpecificCustomer(ArrayList<Customer> customers) {
        if (customers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No customers registered yet.");
            return;
        }

        String firstName = JOptionPane.showInputDialog("Enter customer's first name:");
        String lastName = JOptionPane.showInputDialog("Enter customer's last name:");

        boolean found = false;
        for (Customer customer : customers) {
            if (customer.getFirstName().equalsIgnoreCase(firstName) && customer.getLastName().equalsIgnoreCase(lastName)) {
                JOptionPane.showMessageDialog(null, "Customer found:\n" +
                        "Name: " + customer.getFirstName() + " " + customer.getLastName() + "\n" +
                        "Mobile: " + customer.getMobileNumber());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Customer not found.");
        }
    }
}
