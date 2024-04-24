# HotelManagementSystem-v1.0

The **Hotel Management System** is a Java-based application with a graphical user interface (GUI) that allows users to manage hotel operations, including customer registration, staff registration, room booking, and more. The system uses Java Swing for the GUI components and supports basic CRUD (Create, Read, Update, Delete) operations for hotel management.

## Features

- Customer Registration: Register new customers with basic information like name and mobile number.
- Staff Registration: Register staff members with details like name, role, and staff ID.
- Room Management: Add new rooms with unique IDs, type, and capacity.
- Room Booking: Book rooms for specific customers with check-in and check-out dates.
- Display Booked Rooms: View a list of all booked rooms with customer and booking details.
- Display Available Rooms: Check which rooms are available for booking.
- Search Functionality: Find specific customers or staff members based on given criteria.
- Exit Confirmation: Prompt users before exiting the application to avoid accidental closure.

## How to Run the Project

1. Ensure you have Java installed on your system. This project requires at least Java 8 or later.

2. Clone the repository or download the source code.

   ```bash
   git clone https://github.com/YourGitHubUsername/HotelManagementSystem.git
3. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans), or compile and run it from the command line.
To compile from the command line:
javac *.java
To run the application:
java HotelManagementSystemGUI

## Dependencies

This project uses Java Swing for its graphical user interface.
No additional external libraries or dependencies are required.

## Structure

Booking.java: Defines the booking structure, including check-in and check-out dates, associated room, and customer.
BookingDisplay.java: Contains methods to display booked rooms.
Customer.java: Represents a hotel customer with details like first name, last name, and mobile number.
CustomerDisplay.java: Provides methods to display all customers and search for specific ones.
CustomerRegistration.java: Contains methods for registering new customers.
Room.java: Represents a hotel room with attributes like room ID, type, capacity, and availability.
RoomManagement.java: Allows users to add new rooms.
RoomBooking.java: Manages room booking functionality, including creating new bookings and validating dates.
Staff.java: Represents a hotel staff member.
StaffDisplay.java: Provides methods to display all staff and find specific ones by ID.
StaffRegistration.java: Contains methods for registering new staff members.
HotelManagementSystemGUI.java: The main entry point for the project, creating the GUI and adding all related buttons and interactions.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
