import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number for later comparison
        int originalNumber = number;

        // Initialize the sum variable to store the sum of the cubes of the digits
        int sum = 0;

        // Step 1: Use a while loop to extract each digit of the number
        while (number != 0) {
            // Step 2: Find the last digit of the number using modulus operator
            int digit = number % 10;

            // Step 3: Cube the digit and add it to the sum
            sum += Math.pow(digit, 3);

            // Step 4: Remove the last digit from the number by dividing it by 10
            number = number / 10;
        }

        // Step 5: Check if the sum of cubes of the digits is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
