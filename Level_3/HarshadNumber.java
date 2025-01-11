import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to store the sum of digits
        int sum = 0;
        int originalNumber = number;

        // Step 1: Use a while loop to calculate the sum of digits
        while (number != 0) {
            // Step 2: Add the last digit to the sum
            sum += number % 10;

            // Step 3: Remove the last digit from the number
            number = number / 10;
        }

        // Step 4: Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
