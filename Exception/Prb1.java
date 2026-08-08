package Exception;

import java.util.Scanner;

public class Prb1 {
    public static void main(String[] args) {
        String[] records = {"Alice (ID 0)", "Bob (ID 1)", "Charlie (ID 2)", "Diana (ID 3)"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter record ID to retrieve: ");
        String userInput = scanner.nextLine();

        try {
            // Converts String input to int (throws NumberFormatException if non-numeric)
            int id = Integer.parseInt(userInput);

            // Accesses array index (throws ArrayIndexOutOfBoundsException if out of range)
            String record = records[id];

            System.out.println("Successfully retrieved: " + record);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format. Please enter a whole number for the ID.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ID " + userInput + " does not exist. Please enter an ID between 0 and " + (records.length - 1) + ".");

        } finally {
            scanner.close();
        }
    }
}
