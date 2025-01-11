import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number to find its greatest factor (besides itself): ");
        int number = scanner.nextInt();

        // Initialize greatestFactor variable
        int greatestFactor = 1;

        // Loop from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check divisibility
                greatestFactor = i; // Assign greatest factor
                break; // Exit the loop as we found the largest factor
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        scanner.close();
    }
}
