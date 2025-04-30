import java.util.Scanner;

public class HotelManagement {
    static Scanner sc = new Scanner(System.in);
    static int roomsAvailable = 10;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Welcome to Hotel Management System");
            System.out.println("1. Book Room");
            System.out.println("2. Check Room Availability");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    static void bookRoom() {
        if (roomsAvailable > 0) {
            System.out.print("Enter your name: ");
            String name = sc.next();
            roomsAvailable--;
            System.out.println("Room booked successfully for " + name);
        } else {
            System.out.println("Sorry! No rooms available.");
        }
    }

    static void checkAvailability() {
        System.out.println("Rooms available: " + roomsAvailable);
    }

    static void checkout() {
        if (roomsAvailable < 10) {
            roomsAvailable++;
            System.out.println("Thank you for checking out. Visit again!");
        } else {
            System.out.println("All rooms are already vacant.");
        }
    }
}
