import java.util.Scanner;

public class FindMultiples {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the input is valid
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            // Loop backward from 100 to 1
            for (int i = 100; i > 0; i--) {
                // Check if i is a multiple of the input number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}