import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Take input for a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Initialize an array to store the frequency of digits
        int[] frequency = new int[10];

        // Find digits and calculate frequency
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++;     // Increment the frequency of the digit
            number /= 10;           // Remove the last digit
        }

        //  Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
