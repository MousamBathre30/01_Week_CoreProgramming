import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeUsingIteration(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingCharArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the text to check
        System.out.print("Enter text to check for palindrome: ");
        String text = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check for palindrome using the three methods
        boolean resultIteration = isPalindromeUsingIteration(text);
        boolean resultRecursion = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        boolean resultCharArrays = isPalindromeUsingCharArrays(text);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Using Iteration: " + (resultIteration ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (resultRecursion ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Arrays: " + (resultCharArrays ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
