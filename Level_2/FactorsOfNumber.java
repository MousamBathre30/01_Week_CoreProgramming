import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input value from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        System.out.println("The factors of " + number + " are:");
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check divisibility
                System.out.println(i); // Print the factor
            }
        }

        scanner.close();
    }
}
