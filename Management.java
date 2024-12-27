import java.util.Scanner;

class Management {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Management management = new Management();
        management.mainMenu();
    }

    private void mainMenu() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Book a Flight");
            System.out.println("2. Show Details");
            System.out.println("3. Print Ticket");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookFlightMenu();
                    break;
                case 2:
                    showDetails();
                    break;
                case 3:
                    printTicket();
                    break;
                case 4:
                    System.out.println("\nThank you for using our service.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void bookFlightMenu() {
        System.out.println("\n--- Book a Flight ---");
        System.out.println("1. Dubai");
        System.out.println("2. Canada");
        System.out.println("3. UK");
        System.out.println("4. USA");
        System.out.println("5. Australia");
        System.out.println("6. Europe");
        System.out.print("Choose a destination: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bookFlight("Dubai", new String[]{"DUB - 498", "DUB - 602", "DUB - 204"}, new int[]{7500, 9000, 10000});
                break;
            case 2:
                bookFlight("Canada", new String[]{"CA - 101", "CA - 201", "CA - 301"}, new int[]{7500, 9000, 10000});
                break;
            case 3:
                bookFlight("UK", new String[]{"UK - 401", "UK - 501", "UK - 601"}, new int[]{7500, 9000, 10000});
                break;
            case 4:
                bookFlight("USA", new String[]{"US - 701", "US - 801", "US - 901"}, new int[]{7500, 9000, 10000});
                break;
            case 5:
                bookFlight("Australia", new String[]{"AUS - 1001", "AUS - 2001", "AUS - 3001"}, new int[]{7500, 9000, 10000});
                break;
            case 6:
                bookFlight("Europe", new String[]{"EU - 4001", "EU - 5001", "EU - 6001"}, new int[]{7500, 9000, 10000});
                break;
            default:
                System.out.println("Invalid destination. Please try again.");
        }
    }

    private void bookFlight(String destination, String[] flights, int[] charges) {
        System.out.println("\n--- Available Flights to " + destination + " ---");
        for (int i = 0; i < flights.length; i++) {
            System.out.println((i + 1) + ". Flight " + flights[i] + " - Rs. " + charges[i]);
        }
        System.out.print("Choose a flight: ");

        int flightChoice = scanner.nextInt();
        if (flightChoice >= 1 && flightChoice <= flights.length) {
            System.out.println("\nFlight " + flights[flightChoice - 1] + " booked to " + destination + " for Rs. " + charges[flightChoice - 1]);
        } else {
            System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    private void showDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Name: John Doe");
        System.out.println("Passport Number: ABC123456");
        // Replace with real customer details logic
    }

    private void printTicket() {
        System.out.println("\n--- Ticket ---");
        System.out.println("Passenger: John Doe");
        System.out.println("Flight: DUB - 498");
        System.out.println("Destination: Dubai");
        System.out.println("Price: Rs. 7500");
        System.out.println("\nEnjoy your trip!");
        // Replace with real ticket printing logic
    }
}