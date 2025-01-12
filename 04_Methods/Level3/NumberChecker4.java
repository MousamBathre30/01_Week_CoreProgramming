import java.util.Arrays;

import java.util.Scanner;


public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method 
    public static void main(String[] args) {
        
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
        
        // all step of primenumber method , nean number , a soa
        System.out.println("Is " + number + " a Prime number? " + isPrime(number));
        System.out.println("Is " + number + " a Neon number? " + isNeon(number));
        System.out.println("Is " + number + " a Spy number? " + isSpy(number));
        System.out.println("Is " + number + " an Automorphic number? " + isAutomorphic(number));
        System.out.println("Is " + number + " a Buzz number? " + isBuzz(number));
    }
}
