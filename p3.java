import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rooms = new int[3][5];
        int choice;

        do {
            System.out.println("\n----- HOTEL ROOM BOOKING -----");
            System.out.println("1. View All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nRoom Status:");

                    for (int i = 0; i < rooms.length; i++) {
                        System.out.print("Floor " + (i + 1) + ": ");

                        for (int j = 0; j < rooms[i].length; j++) {
                            if (rooms[i][j] == 0) {
                                System.out.print("Room " + (j + 1) + " Available   ");
                            } else {
                                System.out.print("Room " + (j + 1) + " Booked   ");
                            }
                        }

                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter floor number (1-3): ");
                    int floor = sc.nextInt();

                    System.out.print("Enter room number (1-5): ");
                    int room = sc.nextInt();

                    if (floor >= 1 && floor <= 3 && room >= 1 && room <= 5) {
                        if (rooms[floor - 1][room - 1] == 0) {
                            rooms[floor - 1][room - 1] = 1;
                            System.out.println("Room booked successfully.");
                        } else {
                            System.out.println("Room is already booked.");
                        }
                    } else {
                        System.out.println("Invalid floor or room number.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting hotel booking system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}