import java.util.Arrays;

import java.util.Scanner;


public class NumberChecker {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9, 2 columns for digit and count
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column stores the digit
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Increment the count for the digit
        }
        return frequency;
    }

    public static void main(String[] args) {
       
	   
	   
	   Scanner scanner =  new Scanner(System.in);
	   int number = scanner.nextInt();
	   
        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        // Find the sum of the digits
        int sumOfDigits = sumOfDigits(digitsArray);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of the squares of the digits
        int sumOfSquares = sumOfSquaresOfDigits(digitsArray);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digitsArray);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digitsArray);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i][1] > 0) {
                System.out.println("Digit " + digitFrequency[i][0] + ": " + digitFrequency[i][1] + " time(s)");
            }
        }
    }
}
