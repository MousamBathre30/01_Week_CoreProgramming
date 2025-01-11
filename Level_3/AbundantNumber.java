import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to store the sum of divisors.
        int sum = 0;

        // Step 1: Run a for loop to find divisors of the number
        for (int i = 1; i < number; i++) {
            // Step 2: Check if i is a divisor of the number
            if (number % i == 0) {
                // Step 3: Add divisor to sum
                sum += i;
            }
        }

        // Step 4: Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
