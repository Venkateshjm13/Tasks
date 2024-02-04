package task9_programs;

import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int month = scanner.nextInt();
  
        System.out.print("Enter the room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();
 
        System.out.print("Enter the number of days stayed: ");
        int numberOfDays = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Calculate and print the hotel tariff
        calculateHotelTariff(month, roomRentPerDay, numberOfDays);
    }

    // Function to calculate and print the hotel tariff
    private static void calculateHotelTariff(int month, double roomRentPerDay, int numberOfDays) {
        double hotelTariff;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // Room rent is 20% higher during peak seasons
                hotelTariff = roomRentPerDay * numberOfDays * 1.2;
                break;
            default:
                // Regular room rent
                hotelTariff = roomRentPerDay * numberOfDays;
                break;
        }

        // Print the hotel tariff with 2 decimal places
        System.out.printf("%.2f%n", hotelTariff);
    }
}

