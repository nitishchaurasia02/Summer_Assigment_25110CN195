import java.util.*;
class Program_111 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Ticket> bookings = new ArrayList<>();
    static int totalSeats = 50;
    static int bookedSeats = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Bookings");
            System.out.println("3. Check Seat Availability");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    displayBookings();
                    break;
                case 3:
                    checkAvailability();
                    break;
                case 4:
                    cancelTicket();
                    break;
                case 5:
                    System.out.println("Thank you for using our system!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
    static void bookTicket() {
        if (bookedSeats >= totalSeats) {
            System.out.println("Housefull! No tickets available.");
            return;
        }
        System.out.print("Enter Passenger Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter Movie/Show Name: ");
        String showName = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        int ticketId = 1000 + bookings.size() + 1;
        int seatNo = bookedSeats + 1;
        bookings.add(new Ticket(ticketId, name, showName, seatNo, price));
        bookedSeats++;
        System.out.println("Ticket booked successfully! Your Ticket ID is: " + ticketId + " (Seat No: " + seatNo + ")");
    }
    static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("\nAll Current Bookings:");
            for (Ticket t : bookings) {
                t.display();
            }
        }
    }
    static void checkAvailability() {
        int available = totalSeats - bookedSeats;
        System.out.println("\nTotal Capacity  : " + totalSeats);
        System.out.println("Seats Booked    : " + bookedSeats);
        System.out.println("Seats Available : " + available);
    }
    static void cancelTicket() {
        System.out.print("Enter Ticket ID to cancel: ");
        int id = sc.nextInt();
        boolean removed = false;
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).ticketId == id) {
                bookings.remove(i);
                bookedSeats--;
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Ticket canceled successfully.");
        } else {
            System.out.println("Ticket ID not found.");
        }
    }
    static class Ticket {
        int ticketId;
        String passengerName;
        String showName;
        int seatNo;
        double price;
        Ticket(int ticketId, String passengerName, String showName, int seatNo, double price) {
            this.ticketId = ticketId;
            this.passengerName = passengerName;
            this.showName = showName;
            this.seatNo = seatNo;
            this.price = price;
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Ticket ID      : " + ticketId);
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Show Name      : " + showName);
            System.out.println("Seat Number    : " + seatNo);
            System.out.println("Price Paid     : " + price);
        }
    }
}